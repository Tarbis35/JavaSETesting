package org.home.javatest.payments;

public class PaymentProcessor {
    private PaymentsGateway paymentsGateway;

    public PaymentProcessor(PaymentsGateway paymentsGateway) {
        this.paymentsGateway = paymentsGateway;
    }

    public boolean makePayment(double amount){
        PaymentResponse response =paymentsGateway.requestPayment(new PaymentRequest(amount));
        if(response.getStatus() == PaymentResponse.PaymentStatus.OK){
            return true;
        }else return false;
    }
}
