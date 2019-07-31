package ru.itis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.models.Auth;
import ru.itis.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByEmail(String email);
    List<User> findAllByEmail(String email);
    Optional<User> findOneByConfirmString(String confirmString);
}
