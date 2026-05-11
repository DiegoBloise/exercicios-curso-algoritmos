package cursoJava.secao18.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/*
    Fazer um programa para ler um conjunto de produtos a partir de
    um arquivo em formato .csv (suponha que exista pelo menos um produto).

    Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
    nomes, em ordem decrescente, dos produtos que possuem preço
    inferior ao preço médio.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the full file path: ");
        String filePath = sc.nextLine();

        Map<String, Double> products = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.lines().forEach(line -> {
                String productName = line.split(",")[0];
                String productPrice = line.split(",")[1];

                products.put(productName, Double.parseDouble(productPrice));
            });

            Double avgPrice = products.values().stream()
                    .reduce(0.0, Double::sum) / products.values().size();

            System.out.printf("Average price: %.2f\n", avgPrice);

            List<String> productsBelowAvg = products.entrySet().stream()
                    .filter(product -> product.getValue() < avgPrice)
                    .map(product -> product.getKey())
                    .sorted((p1, p2) -> p2.toUpperCase().compareTo(p1.toUpperCase()))
                    .toList();

            productsBelowAvg.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
