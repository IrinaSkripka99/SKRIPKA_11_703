package ru.itis.services;

import org.springframework.ui.ModelMap;
import ru.itis.forms.AccountForm;
import ru.itis.forms.BasketForm;
import ru.itis.forms.SignUpForm;
import ru.itis.models.User;

import java.util.Optional;

public interface UserService {
    void signUp(SignUpForm form, BasketForm basketForm);
    void updateUser(AccountForm form, User user, ModelMap model);
}
