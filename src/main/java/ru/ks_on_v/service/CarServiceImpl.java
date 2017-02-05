package ru.ks_on_v.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ks_on_v.dao.CarDao;
import ru.ks_on_v.model.Car;

import java.util.List;

@Service("carService")
@Transactional
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao dao;

    @Override
    public List<Car> findAllCars() {
        return dao.findAllCars();
    }
}
