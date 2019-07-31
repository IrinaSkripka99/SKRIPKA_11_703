package ru.itis.shop.services;

import ru.itis.shop.models.Basket;
import ru.itis.shop.models.GroupProducts;
import ru.itis.shop.models.Product;
import ru.itis.shop.models.User;

import java.util.List;


public interface BasketService {
    List<GroupProducts> addProductToUserBasket(Basket basket, Long productId);
    Basket createBasket(User user);
    List<GroupProducts> getProduct(Long basketId);
    Basket getBasket(User user);
}
