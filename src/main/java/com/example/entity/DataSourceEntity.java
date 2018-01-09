package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author stliu @ apache.org
 */
@Data
@Entity
public class DataSourceEntity {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String driver;
    @Column(nullable = false)
    private String url;
    @Column(nullable = false)
    private String username;
    private String password;
    @Column(nullable = false)
    private long enabledAfter = Long.MIN_VALUE;
}
