package ru.itis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;
    private String email;
    private String passwordHash;
    private String firstname;
    private String lastname;
    private String weight;
    private String height;
    private String age;
    private String allerges;
}
