package cursoJava.secao12.ex03.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import cursoJava.secao12.ex03.Main;
import cursoJava.secao12.ex03.models.Client;

public class ClientService {

    public ClientService() {

    }

    public Client create() {
        Scanner sc = Main.getScannerInstance();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), formatter);

        return new Client(name, email, birthDate);
    }
}
