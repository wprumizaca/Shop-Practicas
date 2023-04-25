package com.example.tienda.persistence.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.dao.DataAccessException;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "order_status")
public class Order_Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orderStatus")
    private Long id_orderStatus;

    @Column(name = "comments")
    private Long comments;

    @Column(name = "status_date")
    private Date status_date;

    @Column(name = "status_code")
    private String status_code;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_order", nullable = false)
    private Order order;
}
