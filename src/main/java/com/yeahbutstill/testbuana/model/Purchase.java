package com.yeahbutstill.testbuana.model;

import lombok.Data;

import java.util.List;

@Data
public class Purchase {

    private Customer customer;

    private Order order;

    private List<OrderItem> orderItems;

}
