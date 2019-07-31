package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.forms.AccountForm;
import ru.itis.models.User;
import ru.itis.repositories.UsersRepository;
import ru.itis.services.UserService;

import java.util.Optional;

@Controller
public class AccountController {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/account")
    public String getAccountPage(Authentication authentication, ModelMap model) {
        String email = authentication.getName();
        Optional<User> userCandidate = usersRepository.findOneByEmail(email);
        User user=userCandidate.get();
        model.addAttribute("user", user);
        return "account";
    }

    @PostMapping("/account")
    public void updateUser(Authentication authentication, AccountForm form, ModelMap model) {
        String email = authentication.getName();
        Optional<User> userCandidate = usersRepository.findOneByEmail(email);
        User user=userCandidate.get();
        userService.updateUser(form, user, model);
    }
}
