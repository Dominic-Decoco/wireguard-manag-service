package com.wireguardmanagservice.repository;

import com.wireguardmanagservice.entity.VpnConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VpnConfigRepository extends JpaRepository<VpnConfig, Long> {
}
