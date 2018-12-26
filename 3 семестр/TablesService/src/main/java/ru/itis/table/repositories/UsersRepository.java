package ru.itis.table.repositories;

import ru.itis.table.models.User;


public interface UsersRepository extends CrudRepository<User> {
    User findOneByEmail(String email);
}
