package ru.itis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.models.UserState;

import javax.persistence.*;

/**
 * 22.10.2018
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "shop_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Column(length = 300)
    private String password_hash;
    private String firstname;
    private String lastname;
    private String age;
    private String height;
    private String weight;
    private String allerges;

    @Enumerated(value = EnumType.STRING)
    private UserState state;

    private String confirmString;

    public boolean isEnabled() {
        return this.getState().equals(UserState.CONFIRMED);
    }
}
