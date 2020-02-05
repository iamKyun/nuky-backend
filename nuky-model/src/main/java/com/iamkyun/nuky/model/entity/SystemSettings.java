package com.iamkyun.nuky.model.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
