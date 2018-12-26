package ru.itis.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.models.Basket;
import ru.itis.models.BasketOrder;
import ru.itis.models.Product;
import ru.itis.models.User;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


public class BasketRepositoryImpl implements BasketRepository {

    private JdbcTemplate jdbcTemplate;

    //language=SQL
    private static final String SQL_INSERT_INTO_BASKET_ORDER =
            "insert into basket_order(basket_id ,order_id) values(?,?)";

    //language=SQL
    private static final String SQL_INSERT_INTO_BASKET_PRODUCT =
            "insert into basket_product(basket_id ,product_id) values(?,?)";

    //language=SQL
    private static final String SQL_DELETE =
            "DELETE FROM basket_product WHERE basket_id=?;";

    //language=SQL
    private static final String SQL_SEARCH=
            "select id,title,sum(price),count(order_id) FROM orders JOIN basket_order bo on orders.id = bo.order_id where basket_id=? group by bo.order_id,orders.id,bo.basket_id;";

    //language=SQL
    private static final String SQL_SEARCH_PRODUCT=
            "select * FROM product JOIN basket_product bp on product.id = bp.product_id where basket_id=?";

    //language=SQL
    private static final String SELECT_BASKET_BY_USER =
            "select * from basket where user_id = ?";

    //language=SQL
    private static final String INSERT_BASKET =
            "insert into basket (user_id) values (?)";


    public BasketRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    RowMapper<Product> productCountRowMapper = ((resultSet, i) -> Product.builder()
            .id(resultSet.getLong("id"))
            .name(resultSet.getString("name"))
            .fat(resultSet.getDouble("fat"))
            .kal(resultSet.getDouble("kal"))
            .proteins(resultSet.getDouble("proteins"))
            .carboh(resultSet.getDouble("carboh"))
            .build());

    RowMapper<BasketOrder> productbasket=((resultSet, i) -> BasketOrder.builder()
            .id(resultSet.getLong("id"))
            .title(resultSet.getString("title"))
            .sum(resultSet.getInt("sum"))
            .count(resultSet.getInt("count"))
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
    public void update(Basket model) {

    }


    @Override
    public void addProduct(Long product, Long basket) {
        jdbcTemplate.update(SQL_INSERT_INTO_BASKET_ORDER,basket,product);
    }

    @Override
    public void addProductInroBasketProduct(Long product, Long basket) {
        jdbcTemplate.update(SQL_INSERT_INTO_BASKET_PRODUCT,basket,product);
    }


    @Override
    public List<Product> getProducts(Long basketId) {
        return jdbcTemplate.query(SQL_SEARCH_PRODUCT, productCountRowMapper,basketId);
    }

    @Override
    public List<Product> deleteProducts(Long basketId) {
       return jdbcTemplate.query(SQL_DELETE,productCountRowMapper,basketId);
    }


    @Override
    public List<BasketOrder> getOrders(Long basketId) {

        return jdbcTemplate.query(SQL_SEARCH, productbasket,basketId);
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
