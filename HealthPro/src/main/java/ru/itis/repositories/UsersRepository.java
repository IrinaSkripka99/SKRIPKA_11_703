package ru.itis.repositories;

import ru.itis.models.User;

public interface UsersRepository extends CrudRepository<User> {
    User findByName(String email);
    User getUser(String cookie);

}
