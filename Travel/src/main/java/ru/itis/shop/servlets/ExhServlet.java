package ru.itis.shop.servlets;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.shop.repositories.*;
import ru.itis.shop.services.LovelyService;
import ru.itis.shop.services.LovelyServiceImpl;
import ru.itis.shop.services.UsersService;
import ru.itis.shop.services.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/exh")
public class ExhServlet extends HttpServlet {
    private LovelyService lovelyService;
    private UsersService usersService;
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
        req.getRequestDispatcher("jsp/exhibitions.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
