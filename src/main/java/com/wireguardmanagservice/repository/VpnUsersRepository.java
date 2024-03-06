package com.wireguardmanagservice.repository;

import com.wireguardmanagservice.entity.VpnUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface VpnUsersRepository extends JpaRepository<VpnUser, Long> {
    VpnUser findByEmail(String email);

}
