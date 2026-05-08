package services;

import java.time.LocalDate;

import models.Contract;
import models.Installment;

public class ContractService {

    public ContractService() {

    }

    public void processContract(Contract contract, Integer months) {
        for (int month = 1; month <= months; month++) {
            OnlinePaymentService service = new PaypalService();

            Double baseValue = contract.getTotalValue() / months;

            Double interest = service.interest(baseValue, month);
            Double paymentFee = service.paymentFee(baseValue + interest);

            LocalDate dueDate = contract.getDate().plusMonths(month);
            Double amount = baseValue + interest + paymentFee;

            contract.addInstallments(new Installment(dueDate, amount));
        }
    }
}
