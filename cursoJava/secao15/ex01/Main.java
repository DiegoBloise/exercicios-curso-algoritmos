package cursoJava.secao15.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/*
    Fazer um programa para ler o caminho de um arquivo .csv contendo os dados
    de itens vendidos. Cada item possui um nome, preço unitário e quantidade,
    separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv",
    localizado em uma subpasta chamada "out" a partir da pasta original do arquivo de origem,
    contendo apenas o nome e o valor total para aquele item (preço unitário multiplicado
    pela quantidade), conforme exemplo."

*/
public class Main {
    public static void main(String[] args) {

        File path = new File("cursoJava/secao15/ex01/files/");

        String filePath = path.getPath() + "/vendas.csv";

        List<String> summaryLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            for (String line : br.readAllLines()) {

                String product = line.split(",")[0];
                String price = line.split(",")[1];
                String quantity = line.split(",")[2];

                Double total = Double.parseDouble(price) * Double.parseDouble(quantity);

                summaryLines.add(product + "," + total);
            }

            boolean success = new File(path + "/out").mkdir();
            System.out.println(success ? "Diretorio criado com sucesso" : "Erro ao criar diretorio");

            String outputPath = path.getPath() + "/out/summary.csv";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {

                for (String line : summaryLines) {
                    bw.write(line);
                    bw.newLine();
                }

            } catch (Exception e) {
                System.out.println("Erro ao gerar arquivo: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
