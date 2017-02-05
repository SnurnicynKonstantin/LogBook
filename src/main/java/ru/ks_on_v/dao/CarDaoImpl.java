package ru.ks_on_v.dao;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ru.ks_on_v.model.Car;
import ru.ks_on_v.model.Employee;

import java.util.List;

@Repository("carDao")
public class CarDaoImpl extends AbstractDao<Integer, Car> implements CarDao{
    @Override
    public List<Car> findAllCars() {
        Criteria criteria = createEntityCriteria();
        return (List<Car>) criteria.list();
    }
}
