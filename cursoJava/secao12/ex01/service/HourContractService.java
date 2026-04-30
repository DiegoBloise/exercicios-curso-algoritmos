package cursoJava.secao12.ex01.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import cursoJava.secao12.ex01.MainApplication;
import cursoJava.secao12.ex01.models.HourContract;

public class HourContractService {

    public HourContractService() {

    }

    public HourContract create() {
        Scanner sc = MainApplication.getScannerInstance();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Date (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), format);

        System.out.print("Value per hour: ");
        Double valuePerHour = sc.nextDouble();
        sc.nextLine();

        System.out.print("Duration (hours): ");
        Integer hours = sc.nextInt();
        sc.nextLine();

        return new HourContract(date, valuePerHour, hours);
    }
}
