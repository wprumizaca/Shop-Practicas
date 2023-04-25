package com.example.tienda.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "order_details")
public class Order_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orderDetail")
    private Long id_orderDetail;

    @Column(name = "comments")
    private String comments;

    @Column(name = "descount")
    private Float descount;

    @Column(name = "quantuty")
    private Float quantuty;

    @Column(name = "taxes")
    private Float taxes;

    @Column(name = "unit_price")
    private Float unit_price;

    @ManyToOne
    @JoinColumn(name = "id_order", nullable=false)
    private Order order;



}
