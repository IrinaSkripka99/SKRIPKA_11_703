package ru.itis.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.models.Basket;
import ru.itis.models.Order;
import ru.itis.models.Product;
import ru.itis.models.User;
import ru.itis.repositories.BasketRepository;
import ru.itis.repositories.ProductRepository;
import ru.itis.repositories.UsersRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {
    @Controller
    public class ShopController {
        private ObjectMapper objectMapper = new ObjectMapper();
        private final UsersRepository usersRepository;
        private final BasketRepository basketRepository;
        private final ProductRepository productRepository;
        @Autowired
        public ShopController(UsersRepository usersRepository, BasketRepository basketRepository, ProductRepository productRepository) {
            this.usersRepository = usersRepository;
            this.basketRepository = basketRepository;
            this.productRepository = productRepository;

        }
        @GetMapping("/main")
        public String getMainPage(Authentication authentication, HttpServletResponse response) throws IOException {
            Optional<User> user = usersRepository.findOneByEmail(authentication.getName());
            List<Product> ids = new ArrayList<>();
            if (user.isPresent()) {
                Basket basket = basketRepository.findBasketByUser(user.get());
                ids = basket.getProducts();
            }
            String json = objectMapper.writeValueAsString(ids);
            return "main";

        }

        @PostMapping("/main")
        @ResponseBody
        public List<Product> postProduct(@RequestParam("productId") Long productId, Authentication authentication, HttpServletResponse response) throws IOException {
            Optional<User> user = usersRepository.findOneByEmail(authentication.getName());
            List<Product> ids = new ArrayList<>();
            if (user.isPresent()) {
                Basket basket = basketRepository.findBasketByUser(user.get());
                ids = basket.getProducts();
                if(productId==100){
                    ids.clear();
                    basketRepository.delete(basket);
                    Basket basket1 = Basket.builder()
                            .user(user.get())
                            .build();

                    basketRepository.save(basket1);
                }else {
                    Product order = productRepository.findProductById(productId);
                    ids.add(order);
                    basket.setProducts(ids);
                    basketRepository.save(basket);
                }


            }
            return ids;
        }
    }
}
