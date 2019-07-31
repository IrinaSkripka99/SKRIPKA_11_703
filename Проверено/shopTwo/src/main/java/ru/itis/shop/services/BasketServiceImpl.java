package ru.itis.shop.services;

import ru.itis.shop.models.Basket;
import ru.itis.shop.models.GroupProducts;
import ru.itis.shop.models.Product;
import ru.itis.shop.models.User;
import ru.itis.shop.repositories.BasketRepository;
import ru.itis.shop.repositories.BasketRepositoryImpl;
import ru.itis.shop.repositories.UsersRepositoryJdbcTemplateImpl;

import javax.sql.DataSource;
import java.util.List;

public class BasketServiceImpl implements BasketService {


    private BasketRepository basketRepository;
    private UsersRepositoryJdbcTemplateImpl userRepository;

    public BasketServiceImpl(BasketRepository basketRepository) {
        this.basketRepository=basketRepository;
    }

    @Override
    public List<GroupProducts> getProduct(Long basketId) {
        return basketRepository.getProducts(basketId);
    }

    @Override
    public Basket createBasket(User user) {
        return basketRepository.createCookieBasket(user);
    }

    @Override
    public List<GroupProducts> addProductToUserBasket(Basket basket, Long productId) {
        basketRepository.addProduct(productId, basket.getId());
        return basketRepository.getProducts(basket.getId());
    }

    @Override
    public Basket getBasket(User user) {
        return basketRepository.getBasket(user);
    }


}
