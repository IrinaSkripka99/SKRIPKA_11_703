package ru.itis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    private Long id;
    private String name;
    private String passwordHash;
    private String firstname;
    private String lastname;
    private Integer weight;
    private Integer height;
    private Integer age;
    private String allerges;
}
