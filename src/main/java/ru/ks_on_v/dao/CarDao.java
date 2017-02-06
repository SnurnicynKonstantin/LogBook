package ru.ks_on_v.dao;

import ru.ks_on_v.model.Car;
import ru.ks_on_v.model.Employee;

import java.util.List;

public interface CarDao {
    List<Car> findAllCars();

    Car getCar(int id);
}
