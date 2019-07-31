package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.forms.Form;
import ru.itis.models.FormModel;
import ru.itis.repositories.FormRepository;

import java.util.List;

@Service
public class FormService implements FormServ {

    private final FormRepository formRepository;

    @Autowired
    public FormService(FormRepository formRepository) {
        this.formRepository = formRepository;

    }

    @Override
    public void add(Form form) {
        FormModel model = FormModel.builder()
                .email(form.getEmail())
                .secondName(form.getSecondName())
                .skills(form.getSkills())
                .build();
        formRepository.save(model);
    }
}
