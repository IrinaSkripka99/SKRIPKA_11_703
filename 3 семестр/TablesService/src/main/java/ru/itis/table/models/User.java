package ru.itis.table.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String email;
    private String hashPassword;
    private String rawPassword;

    private String firstName;
    private String lastName;
    private Integer countOfPerson;
    private Integer numberPhone;

    private List<Order> orders;

   /* private User(Builder builder) {
        this.email = builder.email;
        this.hashPassword = builder.hashPassword;
        this.countOfPerson = builder.countOfPerson;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.orders = builder.orders;
    }

    public String getRawPassword() {
        return rawPassword;
    }

    public void setRawPassword(String rawPassword) {
        this.rawPassword = rawPassword;
    }

    public static class Builder {
        private Long id;

        private String email;
        private String hashPassword;
        private String rawPassword;

        private String firstName;
        private String lastName;
        private Integer countOfPerson;

        private List<Order> orders;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder hashPassword(String hashPassword) {
            this.hashPassword = hashPassword;
            return this;
        }


        public Builder rawPassword(String rawPassword) {
            this.rawPassword = rawPassword;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder countOfPerson(Integer countOfPerson) {
            this.countOfPerson = countOfPerson;
            return this;
        }

        public Builder orders(List<Order> orders) {
            this.orders = orders;
            return this;
        }

        public User build() {
            return new User(this);
        }


    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getcountOfPerson() {
        return countOfPerson;
    }

    public void setcountOfPerson(Integer countOfPerson) {
        this.countOfPerson = countOfPerson;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(email, user.email) &&
                Objects.equals(hashPassword, user.hashPassword) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(countOfPerson, user.countOfPerson) &&
                Objects.equals(orders, user.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, hashPassword, firstName, lastName, countOfPerson, orders);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", hashPassword='" + hashPassword + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", countOfPerson='" + countOfPerson + '\'' +
                ", orders=" + orders +
                '}';
    }*/
}
