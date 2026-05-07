package services;

public class PaypalService implements OnlinePaymentService {

    public PaypalService() {

    }

    public Double paymentFee(Double amount) {
        return 0.0;
    }

    public Double interest(Double amount, Integer months) {
        return 0.0;
    }
}
