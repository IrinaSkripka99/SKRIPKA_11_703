package ru.itis.services;

import ru.itis.models.BasketOrder;
import ru.itis.models.Basket;
import ru.itis.models.Product;
import ru.itis.models.User;
import ru.itis.repositories.BasketRepository;
import ru.itis.repositories.UsersRepositoryJdbcTemplateImpl;

import java.util.List;

public class BasketServiceImpl implements BasketService {


    private BasketRepository basketRepository;
    private UsersRepositoryJdbcTemplateImpl userRepository;

    public BasketServiceImpl(BasketRepository basketRepository) {
        this.basketRepository=basketRepository;
    }

    @Override
    public List<Product> getProducts(Long  basketId) {
        return basketRepository.getProducts(basketId);
    }

    @Override
    public List<Product> deleteProducts(Long basketId) {
        return basketRepository.deleteProducts(basketId);
    }

    @Override
    public List<BasketOrder> getOrders(Long basketId) {
        return basketRepository.getOrders(basketId);
    }

    @Override
    public Basket createBasket(User user) {
        return basketRepository.createCookieBasket(user);
    }

    @Override
    public List<BasketOrder> addProductToUserBasket(Basket basket, Long productId) {
        basketRepository.addProduct(productId, basket.getId());
        return basketRepository.getOrders(basket.getId());
    }

    @Override
    public List<Product> addProduct(Basket basket, Long productId) {
        basketRepository.addProductInroBasketProduct(productId,basket.getId());
        return basketRepository.getProducts(basket.getId());
    }

    @Override
    public Basket getBasket(User user) {
        return basketRepository.getBasket(user);
    }


}
