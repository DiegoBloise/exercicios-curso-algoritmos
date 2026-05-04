package cursoJava.secao13.ex02.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    private LocalDate manufactureDate;

    public UsedProduct() {

    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String priceTag() {
        return null;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return String.format("%s (used) $%.2f (Manufacture date: %s)", super.getName(), super.getPrice(),
                manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
