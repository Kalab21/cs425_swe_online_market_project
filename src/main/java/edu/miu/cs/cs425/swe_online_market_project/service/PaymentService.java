package edu.miu.cs.cs425.swe_online_market_project.service;

import edu.miu.cs.cs425.swe_online_market_project.model.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> findAllPayments();

    Payment addNewPayment(Payment payment);

    Payment findPaymentById(long id);

    Payment updateById(long id, Payment payment);

    void deletePaymentById(long id);

}
