package cursoJava.secao13.ex02.models;

public class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public String priceTag() {
        return null;
    }

    public Double totalPrice() {
        return super.getPrice() + customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String toString() {
        return String.format("%s $%.2f (Customs fee: $%.2f)", super.getName(), totalPrice(), customFee);
    }
}
