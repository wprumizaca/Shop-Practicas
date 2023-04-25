package com.example.tienda.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "client_address")
public class Client_Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clientAddress")
    private Long id_clientAddress;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "billing_orDelivery")
    private Boolean billing_orDelivery;

    @Column(name = "city")
    private String city;

    @Column(name = "comments")
    private String comments;

    @Column(name = "country")
    private String country;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "address")
    private String address;

    @Column(name = "state")
    private String state;

    @Column(name = "postcode")
    private String postcode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;



}
