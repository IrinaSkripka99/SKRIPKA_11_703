package ru.itis.shop.services;

import ru.itis.shop.models.Lovely;
import ru.itis.shop.models.GroupPlaces;
import ru.itis.shop.models.User;

import java.util.List;


public interface LovelyService {
    List<GroupPlaces> addProductToUserLovely(Lovely basket, Long productId);
    Lovely createLovely(User user);
    List<GroupPlaces> getProduct(Long basketId);
    Lovely getLovely(User user);
}
