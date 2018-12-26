package ru.itis.table.app;

import java.sql.*;
import java.util.Scanner;

public class ApplicationJdbcDemo {
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String USER = "postgres";
    public static final String PASSWORD = "qepiqooo12Q";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement(); // для выполнения SQL-запросов
        ResultSet resultSet = statement.executeQuery("select id,first_name from table_user");//Для отправки серверу БД SQL-выражения

        /*while (resultSet.next()) {
            System.out.print(resultSet.getLong("id") + " ");
            System.out.println(resultSet.getString("first_name"));
        }*/

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String email = scanner.nextLine();
        String hashpassword=scanner.nextLine();

        String insertQuery = "insert into table_user (first_name, last_name, hash_password, email) " +
                "values ('" + firstName + "','" + lastName + "','"+hashpassword+"','" + email + "');";
        System.out.println(insertQuery);
        int affectedRows = statement.executeUpdate(insertQuery);//определяет сколько строк было модифицировано
        System.out.println("Affected - " + affectedRows);
        resultSet = statement.executeQuery("select id, first_name from table_user");
        while (resultSet.next()) {
            System.out.print(resultSet.getLong("id") + " ");
            System.out.println(resultSet.getString("first_name"));
        }

    }
}

