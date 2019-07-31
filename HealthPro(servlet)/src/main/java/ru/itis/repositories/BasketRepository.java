package ru.itis.repositories;

import ru.itis.models.Basket;
import ru.itis.models.BasketOrder;
import ru.itis.models.Product;
import ru.itis.models.User;

import java.util.List;

public interface BasketRepository extends CrudRepository<Basket> {
    void addProduct(Long product, Long basket);
    void addProductInroBasketProduct(Long product, Long basket);
    Basket createCookieBasket(User user);

    List<Product> getProducts(Long basketId);
    List<Product> deleteProducts(Long basketId);
    List<BasketOrder> getOrders(Long basketId);
    /* Basket findByCookieValue(String cookieValue);*/
    Basket getBasket(User user);

}
