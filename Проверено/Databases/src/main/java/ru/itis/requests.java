package ru.itis;

import java.sql.*;

public class requests {

    private static final String URL = "jdbc:postgresql://localhost:5432/file_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qepiqooo12Q";

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet=null;

        //Посещения за март

        resultSet = statement.executeQuery("select count (id) AS result from access where request_date between '2015-03-01 00:00:00'::timestamp and '2015-03-31 23:59:59'::timestamp;");
        resultSet.next();
        System.out.println("Посещений за март "+ resultSet.getString("result"));

        //Среднее количество пользователей в час

        resultSet=statement.executeQuery("select count(*)  3 1 as result from access group by DATE_PART('hour', request_date);");
        System.out.println("Среднее количество пользователей в час");
        for (int i = 1; resultSet.next(); i++) {
            System.out.println(i + ": " + resultSet.getString("result"));
        }

        //Получение количества заказов

        resultSet = statement.executeQuery("select count(id) as result from access where address ='order'");
        resultSet.next();
        System.out.println("Количество заказов: " + resultSet.getString("result"));


    }
}
