package ru.itis.table.repositories;

import lombok.SneakyThrows;
import ru.itis.table.mapper.RowMapper;
import ru.itis.table.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryJdbcImpl implements UsersRepository {

    private Connection connection;

//    //language=SQL
//    private static final String SQL_FIND_BY_ID =
//            "select * from table_user where table_user.id  = ";

    //language=SQL
    private static final String SQL_INSERT_USER =
            "insert into table_user(email, hash_password, first_name, last_name) values (?, ?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_BY_EMAIL =
            "select * from table_user where email = ?;";

    //language=SQL
    private static final String SQL_SELECT_ALL =
            "select * from table_user";

    public UsersRepositoryJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    private RowMapper<User> userRowMapper = row -> {
        try {
            return User.builder()
                    .id(row.getLong("id"))
                    .hashPassword(row.getString("hash_password"))
                    .email(row.getString("email"))
                    .firstName(row.getString("first_name"))
                    .lastName(row.getString("last_name"))
                    .build();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    };

    @Override
    @SneakyThrows
    public User findOneByEmail(String email) {
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_EMAIL);
        statement.setString(1, email);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();

        return userRowMapper.mapRow(resultSet);
    }

    @Override
    @SneakyThrows
    public void save(User model) {
        PreparedStatement statement = connection.prepareStatement(SQL_INSERT_USER);
        statement.setString(1, model.getEmail());
        statement.setString(2, model.getHashPassword());
        statement.setString(3, model.getFirstName());
        statement.setString(4, model.getLastName());
        int affectedRows = statement.executeUpdate();
        if (affectedRows == 0) {
            throw new IllegalArgumentException("Can't save user");
        }
    }

    @Override
    @SneakyThrows
    public User find(Long id) {
        String query = "select * from table_user where id = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();
        return userRowMapper.mapRow(resultSet);
    }

    @Override
    @SneakyThrows
    public List<User> findAll() {
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL);
        ResultSet resultSet = statement.executeQuery();
        List<User> users = new ArrayList<>();

        while (resultSet.next()) {
            User user = userRowMapper.mapRow(resultSet);
            users.add(user);
        }
        return users;
    }
}
