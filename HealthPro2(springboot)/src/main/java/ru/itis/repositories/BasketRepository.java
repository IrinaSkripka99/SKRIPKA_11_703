package ru.itis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.models.Basket;
import ru.itis.models.User;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket,Long> {
    Basket findBasketByUser(User user);

    void removeAllByOrders(List orders);
}
