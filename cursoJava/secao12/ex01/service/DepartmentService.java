package cursoJava.secao12.ex01.service;

import java.util.Scanner;

import cursoJava.secao12.ex01.MainApplication;
import cursoJava.secao12.ex01.models.Department;

public class DepartmentService {

    public DepartmentService() {

    }

    public Department create() {
        Scanner sc = MainApplication.getScannerInstance();

        System.out.print("Enter department's name: ");
        String name = sc.nextLine();

        return new Department(name);
    }
}
