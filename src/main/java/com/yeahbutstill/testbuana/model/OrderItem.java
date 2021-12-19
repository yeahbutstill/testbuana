package com.yeahbutstill.testbuana.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;

    private BigDecimal unitPrice;

    private int quantity;

    private Long productId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;


}