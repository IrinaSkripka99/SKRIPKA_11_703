package ru.itis.table.models;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private LocalDateTime date;
    private User client;
    private List<Order> Orders;

  /*  public Order(Builder builder) {
        this.id =builder. id;
        this.date = builder.date;
        this.client =builder. client;
        this.Orders =builder. Orders;
    }
    public static class Builder {
        private Long id;
        private LocalDateTime date;
        private User client;
        private List<Order> Orders;


        public Builder date(LocalDateTime date) {
            this.date = date;
            return this;
        }

        public Builder client(User client) {
            this.client = client;
            return this;

        }

        public Builder Orders(List<Order> Orders) {
            this.Orders = Orders;
            return this;
        }

        public Order build() {
            return new Order(this);
        }


    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (date != null ? !date.equals(order.date) : order.date != null) return false;
        if (client != null ? !client.equals(order.client) : order.client != null) return false;
        return Orders != null ? Orders.equals(order.Orders) : order.Orders == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (Orders != null ? Orders.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", client=" + client +
                ", Orders=" + Orders +
                '}';
    }

*/
}
