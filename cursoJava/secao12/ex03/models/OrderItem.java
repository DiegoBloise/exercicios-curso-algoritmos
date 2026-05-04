package cursoJava.secao12.ex03.models;

public class OrderItem {

    private Integer quantity;

    private Double price;

    private Product product;

    public OrderItem() {

    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = product.getPrice();
    }

    public Double subTotal() {
        return product.getPrice() * quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return String.format("%s, Quantity: %d, Subtotal: $%.2f", product.toString(), quantity, getPrice());
    }
}
