package ru.itis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.models.FormModel;

import java.util.List;

public interface FormRepository extends JpaRepository<FormModel,Long> {
    List<FormModel> findAllBySkills(String skills);
}
