package br.com.diego.hrpayrool.Controller;

import br.com.diego.hrpayrool.model.entity.Payment;
import br.com.diego.hrpayrool.model.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable int days){
        Payment payment = paymentService.returnPayment(workerId,days);

        return ResponseEntity.ok(payment);
    }

    public ResponseEntity<Payment> getPaymentAlternative(@PathVariable Long workerId, @PathVariable int days) {
        Payment payment = new Payment("Diego", 400.0, days);

        return ResponseEntity.ok(payment);
    }
}
