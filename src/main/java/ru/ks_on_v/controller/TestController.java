package ru.ks_on_v.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.ks_on_v.model.Employee;

import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping(value = { "/test" }, method = RequestMethod.GET)
    public String checkTest(ModelMap model) {
        return "test";
    }
}
