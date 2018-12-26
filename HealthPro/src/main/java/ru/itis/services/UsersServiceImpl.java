package ru.itis.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.itis.forms.AccountForm;
import ru.itis.forms.SignInForm;
import ru.itis.forms.SignUpForm;
import ru.itis.models.Auth;
import ru.itis.repositories.AuthRepository;
import ru.itis.repositories.BasketRepository;
import ru.itis.repositories.UsersRepository;
import ru.itis.models.User;

import java.util.UUID;

public class UsersServiceImpl implements UsersService {

    private PasswordEncoder encoder;

    private UsersRepository usersRepository;
    private AuthRepository authRepository;
    private BasketService basketService;
    private BasketRepository basketRepository;

    public UsersServiceImpl(UsersRepository usersRepository, AuthRepository authRepository, BasketRepository basketRepository) {
        this.usersRepository = usersRepository;
        this.authRepository = authRepository;
        this.encoder = new BCryptPasswordEncoder();
        this.basketRepository=basketRepository;
        basketService = new BasketServiceImpl(basketRepository);
    }

    @Override
    public void signUp(SignUpForm form) {
        User user = User.builder()
                .email(form.getEmail())
                .passwordHash(encoder.encode(form.getPassword()))
                .build();

        usersRepository.save(user);
        user = usersRepository.findByName(user.getEmail());
        basketService.createBasket(user);
    }

    @Override
    public void createAccount(AccountForm form){
        User user = User.builder()
                .id(form.getId())
                .firstname(form.getFirstname())
                .lastname(form.getLastname())
                .weight(form.getWeight())
                .height(form.getHeight())
                .age(form.getAge())
                .allerges(form.getAllerges())
                .build();

        usersRepository.update(user);
    }

    @Override
    public String signIn(SignInForm form) {
        User user = usersRepository.findByName(form.getEmail());

        if (user != null && encoder.matches(form.getPassword(), user.getPasswordHash())) {
            String cookieValue = UUID.randomUUID().toString();

            Auth auth = Auth.builder()
                    .user(user)
                    .cookieValue(cookieValue)
                    .build();

            authRepository.save(auth);

            return cookieValue;
        }
        return null;
    }

    @Override
    public boolean isExistByCookie(String cookieValue) {
        if (authRepository.findByCookieValue(cookieValue) != null) {
            return true;
        }
        return false;
    }

    @Override
    public User getUser(String cookie) {
        return usersRepository.getUser(cookie);
    }
}
