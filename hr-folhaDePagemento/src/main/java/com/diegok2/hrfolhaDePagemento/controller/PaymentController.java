package com.diegok2.hrfolhaDePagemento.controller;

import com.diegok2.hrfolhaDePagemento.model.entity.Payment;
import com.diegok2.hrfolhaDePagemento.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagamentos")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{id}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long id, @PathVariable Integer days){
        Payment payment = paymentService.getPayment(id, days);

        return ResponseEntity.ok(payment);
    }

}
