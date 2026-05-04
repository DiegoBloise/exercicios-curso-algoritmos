package cursoJava.secao13.ex02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cursoJava.secao13.ex02.models.ImportedProduct;
import cursoJava.secao13.ex02.models.Product;
import cursoJava.secao13.ex02.models.UsedProduct;

/*
    Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).
    Ao final, mostrar a etiqueta de preço de cada produto na mesma
    ordem em que foram digitados.

    Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega,
    e produtos usados possuem data de fabricação. Estes dados específicos
    devem ser acrescentados na etiqueta de preço conforme exemplo (próxima página).
    Para produtos importados, a taxa e alfândega deve ser
    acrescentada ao preço final do produto.
*/
public class Main {

    private static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of products: ");
        Integer numberOfProducts = sc.nextInt();
        sc.nextLine();

        List<Product> products = new ArrayList<>();
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.printf("\nProduct #%d data:\n", i + 1);
            System.out.print("Common, used or imported (c/u/i)?: ");
            String option = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            switch (option) {
                case "c":
                    products.add(new Product(name, price));
                    break;
                case "u":
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate manufactureDate = LocalDate.parse(
                            sc.nextLine(),
                            formatter);

                    products.add(new UsedProduct(name, price, manufactureDate));
                    break;
                case "i":
                    System.out.print("Custom Fee: ");
                    Double customFee = sc.nextDouble();
                    sc.nextLine();

                    products.add(new ImportedProduct(name, price, customFee));
                    break;
            }
        }

        System.out.println("\nPRICE TAGS:");
        products.forEach(System.out::println);

        sc.close();
    }

    public static Scanner getScannerInstance() {
        return sc;
    }
}
