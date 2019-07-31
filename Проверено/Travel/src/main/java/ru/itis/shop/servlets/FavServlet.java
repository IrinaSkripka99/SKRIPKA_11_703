package ru.itis.shop.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.shop.models.GroupPlaces;
import ru.itis.shop.models.Lovely;
import ru.itis.shop.models.User;
import ru.itis.shop.repositories.*;
import ru.itis.shop.services.LovelyService;
import ru.itis.shop.services.LovelyServiceImpl;
import ru.itis.shop.services.UsersService;
import ru.itis.shop.services.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/fav")
public class FavServlet extends HttpServlet {

    private List<GroupPlaces> ids = new ArrayList<>();
    private LovelyService lovelyService;
    private UsersService usersService;
    private ObjectMapper objectMapper = new ObjectMapper();
    private LovelyRepository lovelyRepository;

    public void init() throws ServletException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("qepiqooo12Q");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/shop");
        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);
        AuthRepository authRepository = new AuthRepositoryImpl(dataSource);
        lovelyRepository = new LovelyRepositoryImpl(dataSource);
        lovelyService = new LovelyServiceImpl(lovelyRepository);
        usersService = new UsersServiceImpl(usersRepository, authRepository, lovelyRepository);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("jsp/fav.jsp").forward(req, resp);
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("auth")) {
                User user=usersService.getUser(cookie.getValue());
                Lovely lovely = lovelyService.getLovely(user);
                ids = lovelyService.getProduct(lovely.getId());
                break;

            }
        }

        String json = objectMapper.writeValueAsString(ids);
        resp.setContentType("application/json");
        resp.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
