package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.forms.BasketForm;
import ru.itis.forms.SignUpForm;
import ru.itis.services.UserService;

@Controller
public class SignUpController {

    @Autowired
    private UserService userService;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUpUser(SignUpForm signUpForm, BasketForm basketForm) {
        userService.signUp(signUpForm,basketForm);
        return "redirect:/signIn";
    }
}
