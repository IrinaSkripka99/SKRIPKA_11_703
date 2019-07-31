package ru.itis.shop.repositories;

import ru.itis.shop.models.User;

public interface UsersRepository extends CrudRepository<User> {
    User findByName(String name);

    User getUserByUUID(String uuid);

    User getUser(String cookie);
}
