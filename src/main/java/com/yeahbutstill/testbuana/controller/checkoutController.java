package com.yeahbutstill.testbuana.controller;

import com.yeahbutstill.testbuana.model.Purchase;
import com.yeahbutstill.testbuana.model.PurchaseResponse;
import com.yeahbutstill.testbuana.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@CrossOrigin()
@RequestMapping("/api/checkout")
public class checkoutController {

    private final CheckoutService checkoutService;

    @PostMapping("/purchase")
    public PurchaseResponse purchase(@RequestBody Purchase purchase) {
        return this.checkoutService.placeOrder(purchase);
    }
}
