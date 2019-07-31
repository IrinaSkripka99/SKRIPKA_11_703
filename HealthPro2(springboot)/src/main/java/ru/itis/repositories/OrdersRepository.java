package ru.itis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.models.Order;

public interface OrdersRepository extends JpaRepository<Order,Long> {
    Order findOrderById(Long productId);
}
