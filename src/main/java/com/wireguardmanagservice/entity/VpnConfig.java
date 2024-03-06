package com.wireguardmanagservice.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "VpnConfigs")
@Data
public class VpnConfig {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vpn_config_id_seq")
    @SequenceGenerator(name = "vpn_config_id_seq", sequenceName = "vpn_config_id_seq", allocationSize = 1)
    private long id;

    @Column(name = "vpnConfigText", nullable = false)
    private String vpnConfigText;
}
