package ru.itis.shop.repositories;

import ru.itis.shop.models.GroupPlaces;
import ru.itis.shop.models.Lovely;
import ru.itis.shop.models.Lovely;
import ru.itis.shop.models.User;

import java.util.List;

public interface LovelyRepository extends CrudRepository<Lovely> {
    void addProduct(Long product, Long basket);

    Lovely createCookieLovely(User user);

    List<GroupPlaces> getPlaces(Long basketId);

    /* Lovely findByCookieValue(String cookieValue);*/
    Lovely getLovely(User user);

}
