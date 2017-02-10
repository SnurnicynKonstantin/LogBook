package ru.ks_on_v.controller;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.ks_on_v.model.Car;
import ru.ks_on_v.model.Detail;
import ru.ks_on_v.service.CarService;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class CarController {
    @Autowired
    CarService carService;

    @Transactional
    @RequestMapping(value = { "/show-{id}-car" }, method = RequestMethod.GET)
    public String showCat(@PathVariable int id, ModelMap model) {
        Car car = carService.getCar(id);
        Map details = carService.groupDetails(car.getDetails());
        model.addAttribute("car", car);
        model.addAttribute("details", details);
        return "showCar";
    }
}
