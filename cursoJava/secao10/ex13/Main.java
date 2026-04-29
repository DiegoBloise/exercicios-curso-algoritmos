package cursoJava.secao10.ex13;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario)
    de N funcionários. Não deve haver repetição de id.

    Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
    Para isso, o programa deve ler um id e o valor X. Se o id informado não existir,
    mostrar uma mensagem e abortar a operação. Ao final,
    mostrar a listagem atualizada dos funcionários, conforme exemplos.

    Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
    ser mudado livremente. Um salário só pode ser aumentado com base em uma operação
    de aumento por porcentagem dada.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered: ");
        Integer totalEmployees = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalEmployees; i++) {
            System.out.printf("\nEmployee #%d\n", i + 1);
            System.out.print("Id: ");
            Long id = sc.nextLong();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            BigDecimal salary = sc.nextBigDecimal();
            sc.nextLine();

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);
        }

        while (true) {
            System.out.println("\nList of employees:");
            employees.forEach(System.out::println);

            System.out.print("\nEnter the employee id that will have salary increase: ");
            Long employeeId = sc.nextLong();
            sc.nextLine();

            Employee selectedEmployee = employees.stream().filter(e -> e.getId().equals(employeeId)).findFirst()
                    .orElse(null);

            if (selectedEmployee != null) {
                System.out.print("Enter the percentage: ");
                Double percent = sc.nextDouble();
                sc.nextLine();

                selectedEmployee.increaseSalary(percent);
                break;
            }

            System.out.println("This id does not exist! Please choose a valid employee ID.");
        }

        System.out.println("\nList of employees:");
        employees.forEach(System.out::println);

        sc.close();
    }
}
