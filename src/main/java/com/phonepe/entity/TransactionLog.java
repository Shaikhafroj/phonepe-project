package com.phonepe.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction_log")
@Data
public class TransactionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "account_number")
    private long transactionId;

    @Column(name = "sender_user_id")
    private long sender;

    @Column(name = "receiver_user_id")
    private long receiver;

    @Column(name = "amount")
    private double amount;

    @Column(name = "transaction_date")
    private Date transactionDate;

    @Column(name = "status")
    private String status;

}
