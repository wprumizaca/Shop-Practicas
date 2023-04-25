package com.example.tienda.persistence.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long id_order;

    @Column(name = "comments")
    private String comments;

    @Column(name = "order_date")
    private Date order_date;

    @Column(name = "paid_date")
    private Date paid_date;

    @Column(name = "shipped_date")
    private Date shipped_date;

    @Column(name = "special_instructions")
    private String special_instructions;

    @Column(name = "total_price")
    private Float total_price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;


}
