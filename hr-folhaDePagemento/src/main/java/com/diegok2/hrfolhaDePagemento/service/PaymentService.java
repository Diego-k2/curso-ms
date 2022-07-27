package com.diegok2.hrfolhaDePagemento.service;

import com.diegok2.hrfolhaDePagemento.feignClients.WorkerFeignClients;
import com.diegok2.hrfolhaDePagemento.model.entity.Payment;
import com.diegok2.hrfolhaDePagemento.model.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClients workerFeignClients;

    public Payment getPayment(Long workId, int diasTrabalahdos){

        Worker worker = workerFeignClients.findById(workId).getBody();

        return new Payment(worker.getNome(), worker.getValorDiario(), diasTrabalahdos);
    }
}
