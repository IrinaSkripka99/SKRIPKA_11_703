package ru.itis.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.models.BasketOrder;
import ru.itis.models.Basket;
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
import java.util.ArrayList;
import java.util.List;



@WebServlet("/orders")
public class OrderServlet extends HttpServlet {

    private List<BasketOrder> ids = new ArrayList<>();
    private BasketService basketService;
    private UsersService usersService;
    private ObjectMapper objectMapper = new ObjectMapper();
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("auth")) {
                User user = usersService.getUser(cookie.getValue());
                Basket basket = basketService.getBasket(user);
                ids = basketService.getOrders(basket.getId());
                break;

            }
        }

        String json = objectMapper.writeValueAsString(ids);
        response.setContentType("application/json");
        response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long productId = Long.parseLong(request.getParameter("productId"));

        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("auth")) {
                User user = usersService.getUser(cookie.getValue());
                Basket basket = basketService.getBasket(user);
                basketService.addProductToUserBasket(basket, productId);
                ids = basketService.getOrders(basket.getId());
                break;
            }
        }

        String json = objectMapper.writeValueAsString(ids);
        response.setContentType("application/json");
        response.getWriter().write(json);
    }
}
