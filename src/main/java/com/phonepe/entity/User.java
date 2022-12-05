package com.phonepe.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="user_details")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name ="password")
    private String password;

    @Column(name ="mobile_number")
    private long mobileNumber;
}
