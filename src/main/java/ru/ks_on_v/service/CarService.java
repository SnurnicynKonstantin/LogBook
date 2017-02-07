package ru.ks_on_v.service;

import ru.ks_on_v.model.Car;

import java.util.List;

public interface CarService {
    List<Car> findAllCars();

    Car getCar(int id);
}
