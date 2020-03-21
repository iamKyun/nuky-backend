package com.iamkyun.nuky.model.entity;

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
public class SystemSettings {
    private Long id;

    private String settingKey;

    private String settingValue;

    private String description;
}
