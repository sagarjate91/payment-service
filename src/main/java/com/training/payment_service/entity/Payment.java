package com.training.payment_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYMENT_TB")
public class Payment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer paymentId;
    private String paymentStatus;
    private String transactionId= UUID.randomUUID().toString();

}
