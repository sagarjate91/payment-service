package com.training.payment_service.controller;


import com.training.payment_service.entity.Payment;
import com.training.payment_service.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pay")
@AllArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/savePayment")
    public ResponseEntity<Payment> paymentSave(@RequestBody Payment payment){
        return ResponseEntity.ok(paymentService.paymentSave(payment));
    }




}
