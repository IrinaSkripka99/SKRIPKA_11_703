package ru.itis.shop.repositories;

import ru.itis.shop.models.Basket;
import ru.itis.shop.models.GroupProducts;
import ru.itis.shop.models.Product;
import ru.itis.shop.models.User;

import java.util.List;

public interface BasketRepository extends CrudRepository<Basket> {
    void addProduct(Long product, Long basket);

    Basket createCookieBasket(User user);

    List<GroupProducts> getProducts(Long basketId);

    /* Basket findByCookieValue(String cookieValue);*/
    Basket getBasket(User user);

}
