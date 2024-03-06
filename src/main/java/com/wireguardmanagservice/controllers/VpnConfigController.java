package com.wireguardmanagservice.controllers;

import com.wireguardmanagservice.entity.VpnConfig;
import com.wireguardmanagservice.repository.VpnConfigRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api", produces = "application/json")
@CrossOrigin(origins = "http://localhost/**")
public class VpnConfigController {
    private VpnConfigRepository vpnConfigRepository;

    public VpnConfigController (VpnConfigRepository vpnConfigRepository) {
        this.vpnConfigRepository = vpnConfigRepository;
    }
    @GetMapping(path = "configs")
    public Iterable<VpnConfig> getAllConfig(){
        return vpnConfigRepository.findAll();
    }
    @GetMapping(path = "configs/{id}")
    public Optional<VpnConfig> getConfigById(@PathVariable("id") Long id) {
        return vpnConfigRepository.findById(id);
    }


}
