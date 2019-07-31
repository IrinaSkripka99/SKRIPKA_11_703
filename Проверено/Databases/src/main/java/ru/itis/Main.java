package ru.itis;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/file_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qepiqooo12Q";


    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();

        String ip;
        String time;
        String page;
        String data;
        String userID;
        String response;

        int i = 0;

        try {
            Scanner scanner = new Scanner(new FileReader("access.log"));

            while (scanner.hasNext()) {
                    scanner.nextLine();


                String temp[] = scanner.nextLine().split(" - - ");
                ip = temp[0];

                temp = temp[1].split(" \"");
                time = convertToTimeFormat(temp[0]);

                temp = temp[1].split(" /");
                page = (temp[1].split(".phtml"))[0];

                temp = temp[1].split(" ");
                response = temp[3];
                data = temp[4];
                userID = (temp[5].split("ID"))[1];

                statement.executeQuery("INSERT INTO access (ip, request_date, address, response, request_size, user_id) " +
                        "VALUES ( '" + ip + "', '" + time + "', '" + page + "', '" + response + "', '" + data + "', '" + userID + "');");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static String convertToTimeFormat(String s) {

        String time = null;
        s = s.split("\\[")[1];
        s = s.split("\\]")[0];

        String day = s.split("/")[0];
        time = s.split("2015:")[1];
        time = "2015-03-" + day + " " + time;
        return time;
    }
}

