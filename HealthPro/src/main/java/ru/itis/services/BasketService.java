package ru.itis.services;

import ru.itis.models.BasketOrder;
import ru.itis.models.Basket;
import ru.itis.models.Product;
import ru.itis.models.User;

import java.util.List;


public interface BasketService {
    List<BasketOrder> addProductToUserBasket(Basket basket, Long productId);
List<Product> addProduct(Basket basket, Long productId);
    Basket createBasket(User user);
    List<Product> getProducts(Long basketId);
    List<Product> deleteProducts(Long basketId);
    List<BasketOrder> getOrders(Long basketId);
    Basket getBasket(User user);
}
