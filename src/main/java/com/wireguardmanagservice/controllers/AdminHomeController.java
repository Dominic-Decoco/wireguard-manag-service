package com.wireguardmanagservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminHomeController {
    public List<String> users = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
    @GetMapping
    public List<String> getUsers () {
     return users;
    }
}
