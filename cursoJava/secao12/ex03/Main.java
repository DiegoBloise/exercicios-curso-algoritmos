package cursoJava.secao12.ex03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import cursoJava.secao12.ex03.enums.OrderStatus;
import cursoJava.secao12.ex03.models.Client;
import cursoJava.secao12.ex03.models.Order;
import cursoJava.secao12.ex03.service.ClientService;
import cursoJava.secao12.ex03.service.OrderItemService;

/*
    Ler os dados de um pedido com N itens (N fornecido pelo usuário).
    Depois, mostrar um sumário do pedido conforme exemplo (próxima página).
    Nota: o instante do pedido deve ser o instante do sistema: new Date()
*/
public class Main {

    private static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ClientService clientService = new ClientService();
        OrderItemService orderItemService = new OrderItemService();

        System.out.println("Enter client data:");
        Client client = clientService.create();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        System.out.print("How many items to this order?: ");
        Integer numberOfItems = sc.nextInt();
        sc.nextLine();

        Order order = new Order(LocalDateTime.now(), status, client);

        for (int i = 0; i < numberOfItems; i++) {
            System.out.printf("Enter #%d item data:\n", i + 1);
            order.addItem(orderItemService.create());
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.printf("Order moment: %s\n",
                order.getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.printf("Order status: %s\n", order.getStatus());
        System.out.printf("Client: %s\n", order.getClient().toString());
        System.out.println("Order items:");
        order.getItems().forEach(System.out::println);
        System.out.printf("Total price: $%.2f\n", order.total());

        sc.close();
    }

    public static Scanner getScannerInstance() {
        return sc;
    }
}