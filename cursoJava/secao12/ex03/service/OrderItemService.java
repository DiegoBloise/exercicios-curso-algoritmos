package cursoJava.secao12.ex03.service;

import java.util.Scanner;

import cursoJava.secao12.ex03.Main;
import cursoJava.secao12.ex03.models.OrderItem;
import cursoJava.secao12.ex03.models.Product;

public class OrderItemService {

    public OrderItemService() {

    }

    public OrderItem create() {
        Scanner sc = Main.getScannerInstance();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        Double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Quantity: ");
        Integer quantity = sc.nextInt();
        sc.nextLine();

        Product product = new Product(name, price);

        return new OrderItem(quantity, product);
    }
}
