package com.yeahbutstill.testbuana.service;

import com.yeahbutstill.testbuana.model.Purchase;
import com.yeahbutstill.testbuana.model.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
