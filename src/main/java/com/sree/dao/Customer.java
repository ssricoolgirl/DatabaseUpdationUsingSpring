package com.sree.dao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "contactus")
@Data
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "FIRST_NAME")
    private String name;
    @Column(name = "YOUR_EMAIL")
    private String yourEmail;
    @Column(name = "YOUR_PHONE")
    private int yourPhone;
    @Column(name = "SUBJECT")
    private String subject;
    @Column(name = "MESSAGE")
    private String message;

}
