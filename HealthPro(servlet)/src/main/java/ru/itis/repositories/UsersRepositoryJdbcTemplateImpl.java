package ru.itis.repositories;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.models.Account;
import ru.itis.models.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



public class UsersRepositoryJdbcTemplateImpl implements UsersRepository {

    private JdbcTemplate jdbcTemplate;

    //language=SQL
    private static final String SQL_SELECT_USER_BY_ID =
            "select * from shop_user where id = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_USERS =
            "select * from shop_user";

    //language=SQL
    private static final String SQL_INSERT =
            "insert into shop_user(email, password_hash) values (?, ?)";

    //language=SQL
    private static final String SQL_SELECT_BY_NAME =
            "select * from shop_user where email = ?";

    //language=SQL
    private static final String SQL_SELECT_COOKIE =
                    "SELECT * FROM shop_user,auth WHERE auth.user_id = shop_user.id AND cookie_value = ?;";

    //language=SQL
    private static final String SQL_INSERT_INF=
            "update shop_user SET firstname=?,lastname=?,weight=?,height=?,age=?,allerges=? " +
                    "where id=? ";

    private RowMapper<User> userRowMapper = (resultSet, i) -> User.builder()
            .id(resultSet.getLong("id"))
            .email(resultSet.getString("email"))
            .passwordHash(resultSet.getString("password_hash"))
            .firstname(resultSet.getString("firstname"))
            .lastname(resultSet.getString("lastname"))
            .weight(resultSet.getString("weight"))
            .height(resultSet.getString("height"))
            .age(resultSet.getString("age"))
            .allerges(resultSet.getString("allerges"))
            .build();

    public UsersRepositoryJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL_USERS, userRowMapper);
    }

    @Override
    public User find(Long id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_USER_BY_ID,
                userRowMapper, new Object[]{id});
    }

    @Override
    public void save(User model) {

        jdbcTemplate.update(SQL_INSERT, model.getEmail(), model.getPasswordHash());
    }


    @Override
    public void update(User model) {
        jdbcTemplate.update(SQL_INSERT_INF,model.getFirstname(),model.getLastname(), model.getWeight(),model.getHeight(),model.getAge(),
                    model.getAllerges(),model.getId());
    }

    @Override
    public User findByName(String email) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_BY_NAME, userRowMapper, email);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

        public User getUser(String cookie) {
        User user = jdbcTemplate.queryForObject(SQL_SELECT_COOKIE, userRowMapper, cookie);
        return user;
    }
}
