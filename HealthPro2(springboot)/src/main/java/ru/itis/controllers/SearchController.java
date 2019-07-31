package ru.itis.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.models.FormModel;
import ru.itis.repositories.FormRepository;
import ru.itis.services.FormServ;

import java.util.List;

@Controller
public class SearchController {
    @Autowired
    private FormRepository formRepository;

    @GetMapping("/searchPeople")
    public String getPage() {
        return "searchPeople";
    }

    @PostMapping("/searchPeople")
    public String addForm(@RequestParam(value = "skills", required = false) String skills, ModelMap model) {
        List<FormModel> users;
        String[] lineArray = skills.split(",");
        for (String aLineArray : lineArray) {
            users = formRepository.findAllBySkills(aLineArray);
            model.addAttribute("users", users);
        }
        return "searchPeople";
    }
}
