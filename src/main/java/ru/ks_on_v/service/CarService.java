package ru.ks_on_v.service;

import ru.ks_on_v.model.Car;
import ru.ks_on_v.model.Detail;

import java.util.List;
import java.util.Map;

public interface CarService {
    List<Car> findAllCars();

    Car getCar(int id);

    Map groupDetails(List<Detail> detailsFromCar);
}
