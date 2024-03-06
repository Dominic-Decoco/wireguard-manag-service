package com.wireguardmanagservice.controllers;

import com.wireguardmanagservice.entity.VpnConfig;
import com.wireguardmanagservice.entity.VpnUser;
import com.wireguardmanagservice.repository.VpnUsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api", produces = "application/json")
@CrossOrigin(origins = "*")
public class VpnUserController {

    private VpnUsersRepository vpnUsersRepository;
    private PasswordEncoder passwordEncoder;

    public VpnUserController (VpnUsersRepository vpnUsersRepository, PasswordEncoder passwordEncoder) {
        this.vpnUsersRepository = vpnUsersRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @GetMapping(path = "users")
    public Iterable<VpnUser> getAllConfig(){
        return vpnUsersRepository.findAll();
    }
    @GetMapping(path = "users/{id}")
    public Optional<VpnUser> getConfigById(@PathVariable("id") Long id) {
        return vpnUsersRepository.findById(id);
    }

    @PostMapping(path = "signup")
    public String addUser (@RequestBody VpnUser vpnUser) {
        vpnUser.setPassword(passwordEncoder.encode(vpnUser.getPassword()));
        vpnUsersRepository.save(vpnUser);
        return "User is saved";
    }

}
