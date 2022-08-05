package br.com.diego.hrpayrool.model.services;


import br.com.diego.hrpayrool.FeignClients.WorkerFeignClients;
import br.com.diego.hrpayrool.model.entity.Payment;
import br.com.diego.hrpayrool.model.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    WorkerFeignClients workerFeignClients;

    public Payment returnPayment(Long workerId, int days){
        Map<String, String> uriVariable = new HashMap<>();

        uriVariable.put("id", String.valueOf(workerId));

        Worker worker = workerFeignClients.findById(workerId).getBody();

        return new Payment(worker.getNome(), worker.getValorDiario(), days);

    }
}
