package com.example.tienda.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long id_client;

    @Column(name = "comments")
    private String comments;

    @Column(name = "date_ofBirth")
    private Date date_ofBirth;

    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "middle_name")
    private String middle_name;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "phone")
    private String phone;


}
