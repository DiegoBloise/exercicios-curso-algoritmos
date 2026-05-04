package cursoJava.secao12.ex03.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import cursoJava.secao12.ex03.enums.OrderStatus;

public class Order {

    private LocalDateTime moment;

    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();

    private Client client;

    public Order() {

    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        return items.stream()
                .map(item -> item.getPrice())
                .reduce(0.0, Double::sum);
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
