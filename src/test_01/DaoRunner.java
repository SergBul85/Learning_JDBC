package test_01;

import test_01.dao.CarDao;
import test_01.entity.Car;

import java.sql.SQLException;

public class DaoRunner {
    public static void main(String[] args) throws SQLException {

        CarDao carDao = CarDao.getInstance();

        System.out.println(carDao.getAllCars());

        carDao.updateCar(4, "MOSKVICH", 33.0);

        System.out.println(carDao.getAllCars());
    }
}
