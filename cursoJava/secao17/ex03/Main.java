package cursoJava.secao17.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/*
    Na contagem de votos de uma eleição, são gerados vários registros
    de votação contendo o nome do condidato e a quantidade de votos
    (formato .csv) que ele obteve em uma urna de votação. Você deve
    fazer um programa para ler os registro de votaçao a partir de um
    arquivo, e daí gerar um relatório consolidado com os totais de cada
    candidato.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the full file path: ");
        String filePath = sc.nextLine();

        Map<String, Integer> results = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.lines().forEach(line -> {
                String[] fields = line.split(",");

                String candidate = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if (results.containsKey(candidate)) {
                    results.put(candidate, results.get(candidate).intValue() + votes);
                } else {
                    results.put(candidate, votes);
                }
            });

            results.forEach((candidate, totalVotes) -> {
                System.out.printf("%s: %d\n", candidate, totalVotes);
            });

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
