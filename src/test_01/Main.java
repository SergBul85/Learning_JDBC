package test_01;

import test_01.util.ConnectionManager;

import java.sql.*;

public class Main {


    public static void main(String[] args) {

//        System.out.println("Введите айди автомобиля:");
//        int carId = Integer.parseInt(new Scanner(System.in).nextLine());

        Class<Driver> driverClass = Driver.class;

        String str = "CREATE TABLE IF NOT EXISTS cars (" +
                     "id INT PRIMARY KEY," +
                     "name VARCHAR(255)," +
                     "speed DOUBLE )";

        String str2 = "DROP TABLE IF EXISTS cars;";
        String str3 = "INSERT INTO cars VALUES " +
                      "(4,'Mazda',150.0)," +
                      "(5,'BMW',225.0)," +
                      "(6,'AUDI',200.0);";
        String str4 = "UPDATE cars SET speed=333.0 " +
                      "WHERE id IN (4,5,6)";

        String str5 = "SELECT id, name, speed FROM cars WHERE id >= ? ";
        String str6 = "INSERT INTO cars (name, speed) VALUES " +
                      "('SUBARU',777.0);";

        String str7 = "DELETE FROM cars WHERE id = 3";
        String str8 = "DELETE FROM cars WHERE id = 5";
        String str9 = "DELETE FROM cars WHERE id = 6";

        try {
            Connection connection = ConnectionManager.get();
            Statement statement = connection.createStatement();

            statement.addBatch(str7);
            statement.addBatch(str8);
            statement.addBatch(str9);

            statement.executeBatch();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}