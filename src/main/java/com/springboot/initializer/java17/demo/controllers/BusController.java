package com.springboot.initializer.java17.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.initializer.java17.demo.models.Bus;

@Controller
public class BusController {
    @GetMapping("/bus/view")
    public String getAllBuses(Model model){
        System.out.println("Getting all buses");
        List<Bus> bus = new ArrayList<>();
        bus.add(new Bus("New Flyer", "XDE60", 2019, "Cummins L9", "BAE Systems", 1000000, "R5", true, 120, false, true));
        bus.add(new Bus("Nova Bus", "LFS", 2008, "Cummins L9", "Allision B400R", 500000, "402", false, 60, false, false));
        model.addAttribute("busses", bus);
        return "bus/previewTable";
    }
}
