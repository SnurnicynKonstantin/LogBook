package ru.ks_on_v.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.ks_on_v.model.Car;
import ru.ks_on_v.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {
    @Autowired
    CarService carService;

    @RequestMapping(value = { "/show-${id}-car" }, method = RequestMethod.GET)
    public String showCat(@PathVariable int id) {
        Car car = carService.getCar(id);
        return "showCar";
    }
}
