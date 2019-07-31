package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.forms.Form;
import ru.itis.services.FormServ;
import ru.itis.services.FormService;

@Controller
public class FormController {

    @Autowired
    private FormServ formServ;

    @GetMapping("/form")
    public String getPage() {
        return "form";
    }

    @PostMapping("/form")
    public String addForm(Form form) {
       formServ.add(form);
        return "form";
    }

}
