package ru.itis.shop.repositories;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.shop.models.Basket;
import ru.itis.shop.models.GroupProducts;
import ru.itis.shop.models.Product;
import ru.itis.shop.models.User;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;



public class BasketRepositoryImpl implements BasketRepository {

    private JdbcTemplate jdbcTemplate;

    //language=SQL
    private static final String SQL_INSERT_INTO_BASKET_PRODUCT =
            "insert into basket_product(basket_id ,product_id) values(?,?)";

    //language=SQL
    private static final String SQL_SELECT_ID =
            "SELECT id,title,sum(price) FROM product JOIN basket_product bp on product.id = bp.product_id AND basket_id = ? GROUP BY product.id;";

    //language=SQL
    private static final String SELECT_BASKET_BY_USER =
            "select * from basket where user_id = ?";

    //language=SQL
    private static final String INSERT_BASKET =
            "insert into basket (user_id) values (?)";

    //language=SQL
    private static final String SQL_SELECT_BASKET_PRODUCT =
            "select * from basket_product where id = ?";
    

    public BasketRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    RowMapper<GroupProducts> productCountRowMapper = ((resultSet, i) ->GroupProducts.builder()
            .id(resultSet.getLong("id"))
            .title(resultSet.getString("title"))
            .sum(resultSet.getInt("sum"))
            .build());

    @Override
    public List<Basket> findAll() {
        ArrayList<Basket> basketProducts = new ArrayList<>();
        return basketProducts;
    }

    @Override
    public Basket find(Long id) {
        return null;
    }

    @Override
    public void save(Basket model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Basket model) {

    }


    @Override
    public void addProduct(Long product, Long basket) {
        jdbcTemplate.update(SQL_INSERT_INTO_BASKET_PRODUCT,basket,product);
    }

    @Override
    public List<GroupProducts> getProducts(Long basketId) {
        return jdbcTemplate.query(SQL_SELECT_ID, productCountRowMapper, basketId);
    }

    private RowMapper<Basket> basketRowMapper = (resultSet, i) -> Basket.builder()
            .id(resultSet.getLong("id"))
            .build();

    //создание корзины для юзера
    @Override
    public Basket createCookieBasket(User user) {
        System.out.println(user.getId());
        jdbcTemplate.update(INSERT_BASKET, user.getId());
        return getBasket(user);
    }

    //возвращаем объект,сформированный по запросу
    @Override
    public Basket getBasket(User user) {
        return jdbcTemplate.queryForObject(SELECT_BASKET_BY_USER, basketRowMapper, user.getId());
    }


}
