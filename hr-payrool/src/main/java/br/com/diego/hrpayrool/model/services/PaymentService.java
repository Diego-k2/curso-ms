package br.com.diego.hrpayrool.model.services;


import br.com.diego.hrpayrool.model.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment returnPayment(Long workerId, int days){



        return new Payment("Diego", 150.0, days);

    }
}
