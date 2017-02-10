package ru.ks_on_v.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ks_on_v.dao.CarDao;
import ru.ks_on_v.model.Car;
import ru.ks_on_v.model.Detail;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("carService")
@Transactional
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao dao;

    @Override
    public List<Car> findAllCars() {
        return dao.findAllCars();
    }

    @Override
    public Car getCar(int id) {
        Car car = dao.getCar(id);

        return car;
    }

    @Override
    public Map groupDetails(List<Detail> detailsFromCar) {
        HashMap<String, ArrayList> details = new HashMap<>();
        for(Detail detailCar: detailsFromCar){
            String category = detailCar.getCategory().getCategory();
            if (!details.containsKey(category))
                details.put(category, new ArrayList());
            details.get(category).add(detailCar);
        }

        return details;
    }
}
