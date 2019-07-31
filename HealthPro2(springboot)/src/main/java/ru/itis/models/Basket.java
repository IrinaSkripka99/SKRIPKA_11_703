package ru.itis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "basket")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(
            name="basket_product",
            joinColumns=@JoinColumn(name="basket_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="product_id", referencedColumnName="id"))
    private List<Product> products;

    @ManyToMany
    @JoinTable(
            name="basket_order",
            joinColumns=@JoinColumn(name="basket_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="order_id", referencedColumnName="id"))
    private List<Order> orders;
}
