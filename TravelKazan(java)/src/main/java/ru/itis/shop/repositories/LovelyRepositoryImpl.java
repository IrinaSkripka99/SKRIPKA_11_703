package ru.itis.shop.repositories;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.shop.models.Lovely;
import ru.itis.shop.models.GroupPlaces;
import ru.itis.shop.models.Lovely;
import ru.itis.shop.models.User;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;



public class LovelyRepositoryImpl implements LovelyRepository {

    private JdbcTemplate jdbcTemplate;

    //language=SQL
    private static final String SQL_INSERT_INTO_BASKET_PRODUCT =
            "insert into lovely_place(lovely_id ,place_id) values(?,?)";

    //language=SQL
    private static final String SQL_SELECT_ID =
            "SELECT id,title,sum(price) FROM place JOIN lovely_place bp on place.id = bp.place_id AND lovely_id = ? GROUP BY place.id;";

    //language=SQL
    private static final String SELECT_BASKET_BY_USER =
            "select * from lovely where book_user_id = ?";

    //language=SQL
    private static final String INSERT_BASKET =
            "insert into lovely (book_user_id) values (?)";

    //language=SQL
    private static final String SQL_SELECT_BASKET_PRODUCT =
            "select * from lovely_place where id = ?";
    

    public LovelyRepositoryImpl (DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    RowMapper<GroupPlaces> placeCountRowMapper = ((resultSet, i) -> GroupPlaces.builder()
            .id(resultSet.getLong("id"))
            .title(resultSet.getString("title"))
            .sum(resultSet.getInt("sum"))
            .build());

    @Override
    public List<Lovely> findAll() {
        ArrayList<Lovely> lovelyArrayList = new ArrayList<>();
        return lovelyArrayList;
    }

    @Override
    public Lovely find(Long id) {
        return null;
    }

    @Override
    public void save(Lovely model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Lovely model) {

    }


    @Override
    public void addProduct(Long place, Long lovely) {
        jdbcTemplate.update(SQL_INSERT_INTO_BASKET_PRODUCT,lovely,place);
    }

    @Override
    public List<GroupPlaces> getPlaces(Long lovelyId) {
        return jdbcTemplate.query(SQL_SELECT_ID, placeCountRowMapper, lovelyId);
    }

    private RowMapper<Lovely> lovelyRowMapper = (resultSet, i) -> Lovely.builder()
            .id(resultSet.getLong("id"))
            .build();

    //создание корзины для юзера
    @Override
    public Lovely createCookieLovely(User user) {
        System.out.println(user.getId());
        jdbcTemplate.update(INSERT_BASKET, user.getId());
        return getLovely(user);
    }

    //возвращаем объект,сформированный по запросу
    @Override
    public Lovely getLovely(User user) {
        return jdbcTemplate.queryForObject(SELECT_BASKET_BY_USER, lovelyRowMapper, user.getId());
    }


}
