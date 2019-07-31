package ru.itis.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.itis.models.Basket;
import ru.itis.models.Order;
import ru.itis.models.User;
import ru.itis.repositories.BasketRepository;
import ru.itis.repositories.OrdersRepository;
import ru.itis.repositories.UsersRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ShopController {
    private ObjectMapper objectMapper = new ObjectMapper();
    private final UsersRepository usersRepository;
    private final BasketRepository basketRepository;
    private final OrdersRepository ordersRepository;
    @Autowired
    public ShopController(UsersRepository usersRepository, BasketRepository basketRepository, OrdersRepository ordersRepository) {
        this.usersRepository = usersRepository;
        this.basketRepository = basketRepository;
        this.ordersRepository = ordersRepository;
    }
    @GetMapping("/shop")
    public String getShopPage(Authentication authentication, HttpServletResponse response) throws IOException {
        List<Order> ids = new ArrayList<>();
        Optional<User> user = usersRepository.findOneByEmail(authentication.getName());
        if (user.isPresent()) {
            Basket basket = basketRepository.findBasketByUser(user.get());
            ids = basket.getOrders();
        }
        String json = objectMapper.writeValueAsString(ids);
        return "shop";

    }

    @PostMapping("/shop")
    @ResponseBody
    public List<Order> postProduct(@RequestParam("productId") Long productId, Authentication authentication) throws IOException {
        Optional<User> user = usersRepository.findOneByEmail(authentication.getName());
        List<Order> ids = new ArrayList<>();
        if (user.isPresent()) {
            Basket basket = basketRepository.findBasketByUser(user.get());
             ids = basket.getOrders();
            if(productId==100){
                ids.clear();
                basketRepository.delete(basket);
                Basket basket1 = Basket.builder()
                        .user(user.get())
                        .build();

                basketRepository.save(basket1);
            }else {
                Order order = ordersRepository.findOrderById(productId);
                ids.add(order);
                basket.setOrders(ids);
                basketRepository.save(basket);
            }


        }
       return ids;
    }
}
