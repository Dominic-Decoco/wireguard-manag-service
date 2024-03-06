package com.wireguardmanagservice.config;

import com.wireguardmanagservice.entity.VpnUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class VpnUserDetails implements UserDetails {

    private VpnUser vpnUser;

    public VpnUserDetails(VpnUser vpnUser) {
        this.vpnUser = vpnUser;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(vpnUser.getRole().toString()));
    }

    @Override
    public String getPassword() {
        return vpnUser.getPassword();
    }

    @Override
    public String getUsername() {
        return vpnUser.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
