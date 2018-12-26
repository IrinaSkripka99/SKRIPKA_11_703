package ru.itis.table.app;

import ru.itis.table.repositories.UsersRepository;
import ru.itis.table.repositories.UsersRepositoryJdbcImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public class ApplicationUsersRepositoryJdbcImpl {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qepiqooo12Q";

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        UsersRepository usersRepository = new UsersRepositoryJdbcImpl(connection);
        System.out.println(usersRepository.find(2L));
    }
}
