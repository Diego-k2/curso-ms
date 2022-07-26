package com.diegok2.hrfolhaDePagemento.service;

import com.diegok2.hrfolhaDePagemento.model.entity.Payment;
import com.diegok2.hrfolhaDePagemento.model.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-worker.host}") //para pegar algo no properties
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(Long workId, int diasTrabalahdos){

        //Pegando paramentros da url
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+ workId); //Para usar basta fazer igual na linha 28

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);

        return new Payment(worker.getNome(), worker.getValorDiario(), diasTrabalahdos);
    }
}
