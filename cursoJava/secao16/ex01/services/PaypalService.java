package services;

public class PaypalService implements OnlinePaymentService {

    private Double INTEREST = 0.01;
    private Double FEE = 0.02;

    public PaypalService() {

    }

    public Double paymentFee(Double amount) {
        return amount * FEE;
    }

    public Double interest(Double amount, Integer months) {
        return amount * INTEREST * months;
    }
}
