package ru.itis.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.models.FormModel;
import ru.itis.repositories.FormRepository;

import java.util.List;

@Controller
public class StatisticController {

    @Autowired
    private FormRepository formRepository;

    @GetMapping("/statistics")
    public String getPage() {
        return "statistics";
    }

    @PostMapping("/statistics")
    public String addForm(ModelMap model) {
        List<FormModel> users;
        users = formRepository.findAll();
        model.addAttribute("users", users);
        return "statistics";
    }
}
