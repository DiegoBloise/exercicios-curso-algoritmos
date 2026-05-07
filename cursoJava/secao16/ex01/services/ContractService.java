package services;

import java.time.LocalDate;

import models.Contract;
import models.Installment;

public class ContractService {

    public ContractService() {

    }

    public void processContract(Contract contract, Integer months) {
        for (int month = 1; month <= months; month++) {
            LocalDate dueDate = contract.getDate().plusMonths(month);

            Double baseValue = contract.getTotalValue() / months;

            Double fees = baseValue * 0.01 * month;

            Double paymentTax = (baseValue + fees) * 0.02;

            Double amount = baseValue + fees + paymentTax;

            contract.addInstallments(new Installment(dueDate, amount));
        }
    }
}
