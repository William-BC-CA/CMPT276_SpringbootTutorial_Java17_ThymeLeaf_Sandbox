package com.springboot.initializer.java17.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.initializer.java17.demo.models.Users;

@Controller // Listen to the requests
public class UsersController {
    @GetMapping("/users/view") // Can call it whatever you want
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
        // TODO: get all users from the database
        List<Users> users = new ArrayList<>();
        users.add(new Users("william","4567",25));
        users.add(new Users("sara","1234",15));
        users.add(new Users("steve","1234",35));
        users.add(new Users("jacob","1234",5));
        // end of database call
        model.addAttribute("us", users);
        return "users/showAll";
    }
}
