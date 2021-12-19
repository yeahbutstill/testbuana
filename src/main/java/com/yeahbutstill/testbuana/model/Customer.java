package com.yeahbutstill.testbuana.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        if (order != null) {
            if (orders == null) {
                orders = new ArrayList<>();
            }
            orders.add(order);
            order.setCustomer(this);
        }
    }

}
