package ru.itis.table.repositories;

import ru.itis.table.models.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryListImpl implements UsersRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public User findOneByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void save(User model) {
        users.add(model);
    }

    @Override
    public User find(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
