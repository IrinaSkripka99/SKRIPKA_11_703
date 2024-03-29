package ru.itis.servlets;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.forms.AccountForm;
import ru.itis.models.User;
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

@WebServlet("/account")
public class AccountServlet extends HttpServlet {

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
        basketRepository = new BasketRepositoryImpl(dataSource);
        basketService = new BasketServiceImpl(basketRepository);
        usersService = new UsersServiceImpl(usersRepository, authRepository, basketRepository);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("auth")) {
                User user = usersService.getUser(cookie.getValue());
                req.setAttribute("user", user);
            }
        }

        getServletContext().getRequestDispatcher("/jsp/account.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("auth")) {
                User user = usersService.getUser(cookie.getValue());
                Long id = user.getId();
                AccountForm form = AccountForm.builder()
                        .id(id)
                        .firstname(req.getParameter("firstname"))
                        .lastname(req.getParameter("lastname"))
                        .weight(req.getParameter("weight"))
                        .height(req.getParameter("height"))
                        .age(req.getParameter("age"))
                        .allerges(req.getParameter("allerges"))
                        .build();
                usersService.createAccount(form);
            }
        }


        resp.sendRedirect("/account");
    }
}
