package ru.itis.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountForm {
    private String firstname;
    private String lastname;
    private String weight;
    private String height;
    private String age;
    private String allerges;
}
