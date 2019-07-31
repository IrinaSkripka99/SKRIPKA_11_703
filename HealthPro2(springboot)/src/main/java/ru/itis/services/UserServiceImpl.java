package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import ru.itis.forms.AccountForm;
import ru.itis.forms.BasketForm;
import ru.itis.forms.SignUpForm;
import ru.itis.models.Basket;
import ru.itis.models.User;
import ru.itis.models.UserState;
import ru.itis.repositories.BasketRepository;
import ru.itis.repositories.UsersRepository;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;
    private final BasketRepository basketRepository;
    private final PasswordEncoder passwordEncoder;


    @Autowired
    private EmailService emailService;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository, BasketRepository basketRepository, PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
        this.basketRepository = basketRepository;
    }

    @Override
    public void signUp(SignUpForm form, BasketForm basketForm) {
        String confirmString = UUID.randomUUID().toString();
        User user = User.builder()
                .password_hash(passwordEncoder.encode(form.getPassword()))
                .email(form.getEmail())
                .age("Возраст")
                .firstname("Имя")
                .lastname("Фамилия")
                .weight("Вес")
                .height("Рост")
                .allerges("Аллергии")
                .state(UserState.NOT_CONFIRMED)
                .confirmString(confirmString)
                .build();
        usersRepository.save(user);

        Basket basket = Basket.builder()
                .user(user)
                .build();

        basketRepository.save(basket);
        String text = "<a href='http://localhost:80/confirm/" + user.getConfirmString() + "'>" +"Пройдите по ссылке" + "</a>";
        System.out.println(text);
        emailService.sendMail("Подтвреждение регистрации", text, user.getEmail());
    }

    @Override
    public void updateUser(AccountForm form, User user, ModelMap model) {
            user.setFirstname(form.getFirstname());
            user.setLastname(form.getLastname());
            user.setWeight(form.getWeight());
            user.setHeight(form.getHeight());
            user.setAge(form.getAge());
            user.setAllerges(form.getAllerges());
            usersRepository.save(user);
            model.addAttribute("user",user);
    }
}
