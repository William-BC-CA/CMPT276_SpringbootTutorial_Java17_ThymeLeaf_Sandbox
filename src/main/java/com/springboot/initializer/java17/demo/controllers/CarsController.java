package com.springboot.initializer.java17.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.initializer.java17.demo.models.Cars;

@Controller
public class CarsController {
    @GetMapping("/cars/view")
    public String getAllCars(Model model){
        System.out.println("Getting all cars");
        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars("Toyota","Corolla",2019,"1.8L","White",15000,20000,"New"));
        cars.add(new Cars("Honda","Civic",2018,"1.6L","Black",12000,30000,"Used"));
        cars.add(new Cars("Nissan","Sentra",2017,"1.8L","Silver",10000,40000,"Old"));
        model.addAttribute("voiture", cars);
        return "cars/previewAll";
    }
}
