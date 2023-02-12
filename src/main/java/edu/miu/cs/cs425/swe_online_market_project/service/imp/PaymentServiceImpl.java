package edu.miu.cs.cs425.swe_online_market_project.service.imp;


import edu.miu.cs.cs425.swe_online_market_project.model.Payment;
import edu.miu.cs.cs425.swe_online_market_project.repository.PaymentRepository;
import edu.miu.cs.cs425.swe_online_market_project.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> findAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment addNewPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment findPaymentById(long id) {
        return paymentRepository.findById(id).orElseGet(null);
    }

    @Override
    public Payment updateById(long id, Payment payment) {
        payment.setPaymentId(id);
        return paymentRepository.save(payment);
    }

    @Override
    public void deletePaymentById(long id) {
        paymentRepository.deleteById(id);
    }

}
