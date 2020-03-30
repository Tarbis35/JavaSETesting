package org.home.javatest.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    PaymentsGateway paymentsGateway;
    PaymentProcessor paymentProcessor;
    @Before
    public void setup(){
        paymentsGateway =Mockito.mock(PaymentsGateway.class);
        paymentProcessor = new PaymentProcessor(paymentsGateway);
    }
    @Test
    public void payment_is_correct() {
        //Preparacion del test
        Mockito.when(paymentsGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        //Ejecucion del metodo
        boolean result =paymentProcessor.makePayment(10000);
        //comprobacion del resultado
        assertTrue(result);

    }
    @Test
    public void payment_is_incorrect() {
        //Preparacion del test
        Mockito.when(paymentsGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        //Ejecucion del metodo
        boolean result = paymentProcessor.makePayment(10000);
        //comprobacion del resultado
        assertFalse(result);
    }
}