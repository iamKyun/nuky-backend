package com.iamkyun.nuky.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author kyun
 *
 */
@Data
@EqualsAndHashCode
@ToString
@Entity(name = "system_settings")
public class SystemSettings {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "setting_key")
    private String settingKey;

    @Basic
    @Column(name = "setting_value")
    private String settingValue;

    @Basic
    @Column(name = "description")
    private String description;
}
