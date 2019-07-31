package ru.itis.shop.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.itis.shop.forms.SignInForm;
import ru.itis.shop.forms.SignUpForm;
import ru.itis.shop.models.Auth;
import ru.itis.shop.repositories.AuthRepository;
import ru.itis.shop.repositories.LovelyRepository;
import ru.itis.shop.repositories.UsersRepository;
import ru.itis.shop.models.User;

import java.util.UUID;

public class UsersServiceImpl implements UsersService {

    private PasswordEncoder encoder;

    private UsersRepository usersRepository;
    private AuthRepository authRepository;
    private LovelyService lovelyService;
    private LovelyRepository lovelyRepository;

    public UsersServiceImpl(UsersRepository usersRepository, AuthRepository authRepository, LovelyRepository lovelyRepository) {
        this.usersRepository = usersRepository;
        this.authRepository = authRepository;
        this.lovelyRepository=lovelyRepository;
        lovelyService = new LovelyServiceImpl(lovelyRepository);

        this.encoder = new BCryptPasswordEncoder();
    }

    @Override
    public void signUp(SignUpForm form) {
        User user = User.builder()
                .name(form.getName())
                .passwordHash(encoder.encode(form.getPassword()))
                .build();

        usersRepository.save(user);
        user = usersRepository.findByName(user.getName());
        lovelyService.createLovely(user);
    }

    @Override
    public String signIn(SignInForm form) {
        User user = usersRepository.findByName(form.getName());

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
