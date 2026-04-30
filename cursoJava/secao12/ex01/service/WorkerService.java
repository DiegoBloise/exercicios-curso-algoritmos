package cursoJava.secao12.ex01.service;

import java.util.Scanner;

import cursoJava.secao12.ex01.MainApplication;
import cursoJava.secao12.ex01.enums.WorkerLevel;
import cursoJava.secao12.ex01.models.Department;
import cursoJava.secao12.ex01.models.Worker;

public class WorkerService {

    public WorkerService() {

    }

    public Worker create(Department department) {
        Scanner sc = MainApplication.getScannerInstance();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Base salary: ");
        Double salary = sc.nextDouble();
        sc.nextLine();

        return new Worker(department, name, level, salary);
    }
}
