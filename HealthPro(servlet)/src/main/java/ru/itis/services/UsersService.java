package ru.itis.services;

import ru.itis.forms.AccountForm;
import ru.itis.forms.SignInForm;
import ru.itis.forms.SignUpForm;
import ru.itis.models.User;


public interface UsersService {
    void signUp(SignUpForm form);

    String signIn(SignInForm form);

    boolean isExistByCookie(String cookieValue);

    void createAccount(AccountForm form);

    User getUser(String cookie);
}
