package ru.itis.servlets;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.forms.SignInForm;
import ru.itis.repositories.*;
import ru.itis.services.BasketService;
import ru.itis.services.BasketServiceImpl;
import ru.itis.services.UsersService;
import ru.itis.services.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signIn")
public class SignInServlet extends HttpServlet {

    private UsersService usersService;
   private BasketService basketService;
    private BasketRepository basketRepository;

    @Override
    public void init() throws ServletException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("qepiqooo12Q");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/HealthPro");
        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);
        AuthRepository authRepository = new AuthRepositoryImpl(dataSource);
        basketRepository=new BasketRepositoryImpl(dataSource);
        basketService = new BasketServiceImpl(basketRepository);
        usersService = new UsersServiceImpl(usersRepository, authRepository,basketRepository);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("jsp/signIn.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // обрабатываем POST-запрос, вытаскиваем из запроса логин и пароль
        SignInForm form = SignInForm.builder()
                .email(req.getParameter("email"))
                .password(req.getParameter("password"))
                .build();
        // передаем логин и пароль сервисам и получаем куку, если такой пользователь
        // в базе обнаружен
        String cookieValue = usersService.signIn(form);

        // если пользователь был в базе и его кука не была нулевой
        if (cookieValue != null) {
            // добавляем эту куку в ответ
            Cookie auth = new Cookie("auth", cookieValue);
            resp.addCookie(auth);
            resp.sendRedirect("/account");
        } else {
            resp.sendRedirect("/signIn");
        }
    }
}
