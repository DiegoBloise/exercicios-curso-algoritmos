package cursoJava.secao8.ex04;

import java.math.BigDecimal;

public abstract class CurrencyConverter {

    private static final Double IOF = 6.0;

    public static BigDecimal convert(BigDecimal amount, BigDecimal usdPrice) {
        BigDecimal tax = usdPrice.multiply(BigDecimal.valueOf(IOF / 100));
        BigDecimal totalTax = tax.multiply(amount);
        return amount.multiply(usdPrice).add(totalTax);
    }
}
