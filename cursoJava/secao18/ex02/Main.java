package cursoJava.secao18.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cursoJava.secao18.ex02.models.Employee;

/*
    Fazer um programa para ler os dados (nome, email e salário) de funcionários
    a partir de um arquivo em formato .csv.

    Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo
    salário seja superior a um dado valor fornecido pelo usuário.

    Mostrar também a soma dos salários dos funcionários
    cujo nome começa com a letra 'M'.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String filePath = sc.nextLine();

        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.lines().forEach(line -> {
                String[] fields = line.split(",");

                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);

                employees.add(new Employee(name, email, salary));
            });

            System.out.print("Enter salary: ");
            Double salaryFilterValue = sc.nextDouble();

            System.out.println("Email of people whose salary is more than 2000.00:");
            employees.stream()
                    .filter(employee -> employee.getSalary() > salaryFilterValue)
                    .map(employee -> employee.getEmail())
                    .sorted()
                    .forEach(System.out::println);

            System.out.print("Sum of salary of people whose name starts with 'M': ");
            System.out.printf("%.2f",
                    employees.stream()
                            .filter(employee -> employee.getName().toUpperCase().charAt(0) == 'M')
                            .map(employee -> employee.getSalary())
                            .reduce(0.0, Double::sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
