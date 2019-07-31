package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.services.ConfirmService;
import ru.itis.services.EmailService;

@Controller
public class ConfirmController {

    @Autowired
    private ConfirmService confirmService;

    @GetMapping("/confirm/{confirm-string}")
    @ResponseBody
    public String confirmUser(@PathVariable("confirm-string") String confirmString) {
        confirmService.confirm(confirmString);
        return "Успешно";
    }
}
