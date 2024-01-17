package com.wireguardmanagservice.repository;

import com.wireguardmanagservice.entity.VpnUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VpnUsersRepository extends CrudRepository<VpnUser, Long> {

}
