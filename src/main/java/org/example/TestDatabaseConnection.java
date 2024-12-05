package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3307/test?useSSL=false&serverTimezone=UTC";
    String user = "root";
    String password = "admin"; // Ваш пароль

    try {
      Connection connection = DriverManager.getConnection(url, user, password);
      if (connection != null) {
        System.out.println("Подключение к базе данных установлено!");
        connection.close();
      }
    } catch (SQLException e) {
      System.err.println("Ошибка подключения: " + e.getMessage());
    }
  }
}
