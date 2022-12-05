package com.phonepe.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="account_details")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private int id;

    @Column(name = "account_number")
    private long accountNumber;

    @Column(name = "ifsc")
    private String ifsc;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "balance")
    private double balance;
}
