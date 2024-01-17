package com.wireguardmanagservice.controllers;

import com.wireguardmanagservice.entity.VpnUser;
import com.wireguardmanagservice.repository.VpnUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "", produces = "application/json")
@CrossOrigin("*")
public class VpnUsersController {
    int count = 1;
    @Autowired
    private VpnUsersRepository vpnUsersRepository;
    @GetMapping("all-users")
    public Iterable<VpnUser> getAllUsers() {
        return vpnUsersRepository.findAll();
    }
    @RequestMapping("create-user")
    public VpnUser createUser() {

        VpnUser vpnUser = new VpnUser();
        vpnUser.setEmail(count+"@mail.test");
        count ++;
        vpnUser.setRegistrationDate(LocalDateTime.now());
        return vpnUsersRepository.save(vpnUser);
    }
}
