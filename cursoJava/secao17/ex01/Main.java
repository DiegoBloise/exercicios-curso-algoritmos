package cursoJava.secao17.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import cursoJava.secao17.ex01.models.LogEntry;

/*
    Um site de internet registra um log de acessos dos usuários.
    Um registro de log consiste no nome de usuário (apenas uma palavra)
    e o instante em que o usuário acessou o site no padrão ISO 8601,
    separados por espaço, conforme exemplo. Fazer um programa que leia
    o log de acessos a partir de um arquivo, e daí informe quantos usuários
    distintos acessaram o site.
*/
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String filePath = sc.nextLine();

        Set<LogEntry> logs = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.lines().forEach(entry -> {
                String[] fields = entry.split(" ");

                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                logs.add(new LogEntry(username, moment));
            });
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Integer totalUsers = logs.size();
        System.out.println("Total Users: " + totalUsers);

        sc.close();
    }
}