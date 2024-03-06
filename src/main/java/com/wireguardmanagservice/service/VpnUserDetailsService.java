package com.wireguardmanagservice.service;

import com.wireguardmanagservice.config.VpnUserDetails;
import com.wireguardmanagservice.entity.VpnUser;
import com.wireguardmanagservice.repository.VpnUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VpnUserDetailsService implements UserDetailsService {

    @Autowired
    private VpnUsersRepository vpnUsersRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<VpnUser> vpnUser = Optional.ofNullable(vpnUsersRepository.findByEmail(username));
        return vpnUser.map(VpnUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException(username + "not found"));
    }
}
