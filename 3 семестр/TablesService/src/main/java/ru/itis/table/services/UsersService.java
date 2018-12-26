package ru.itis.table.services;

import ru.itis.table.forms.LoginForm;
import ru.itis.table.forms.UserForm;
import ru.itis.table.models.User;
import ru.itis.table.transfer.UserDto;

import java.util.List;

public interface UsersService {
    void register(UserForm userForm);
    boolean isRegistered(User user);
    List<UserDto> getAllUsers();

    void login(LoginForm loginForm);
}


