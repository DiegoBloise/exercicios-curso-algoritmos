package cursoJava.secao9.ex01;

import java.math.BigDecimal;

public class Account {

    private final BigDecimal WITHDRAW_TAX = new BigDecimal(5);

    private Long number;
    private String name;
    private BigDecimal balance = BigDecimal.ZERO;

    public Account(Long number, String name, BigDecimal initialDeposit) {
        this.number = number;
        this.name = name;
        this.balance = initialDeposit;
    }

    public Account(Long number, String name) {
        this.number = number;
        this.name = name;
    }

    public BigDecimal deposit(BigDecimal amount) {
        return balance = balance.add(amount);
    }

    public BigDecimal withdraw(BigDecimal amount) {
        return balance = balance.subtract(amount).subtract(WITHDRAW_TAX);
    }

    public Long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("\nAccount:\n\tNumber: %d\n\tName: %s\n\tBalance: $ %.2f%n", number, name, balance);
    }
}
