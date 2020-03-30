package org.home.javatest.payments;

public interface PaymentsGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
