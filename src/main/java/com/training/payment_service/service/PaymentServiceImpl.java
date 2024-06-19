package com.training.payment_service.service;

import com.training.payment_service.entity.Payment;
import com.training.payment_service.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService{

    private final PaymentRepository paymentRepository;

    @Override
    public Payment paymentSave(Payment payment) {
        return paymentRepository.save(payment);
    }
}
