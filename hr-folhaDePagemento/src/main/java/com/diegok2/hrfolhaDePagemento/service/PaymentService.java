package com.diegok2.hrfolhaDePagemento.service;

import com.diegok2.hrfolhaDePagemento.model.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workId, int diasTrabalahdos){
        return new Payment("Diego", 100.0, diasTrabalahdos);
    }
}
