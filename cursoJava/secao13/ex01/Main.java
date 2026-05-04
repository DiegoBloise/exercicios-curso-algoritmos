package cursoJava.secao13.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cursoJava.secao13.ex01.models.Employee;
import cursoJava.secao13.ex01.models.OutsourcedEmployee;

/*
    Uma empresa possui funcionários próprios e terceirizados.
    Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
    Funcionários terceirizado possuem ainda uma despesa adicional.

    O pagamento dos funcionários corresponde ao valor da hora multiplicado
    pelas horas trabalhadas, sendo que os funcionários terceirizados ainda
    recebem um bônus correspondente a 110% de sua despesa adicional.

    Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário)
    e armazená-los em uma lista. Depois de ler todos os dados,
    mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.

    Construa o programa conforme projeto ao lado. Veja exemplo na próxima página.
*/
public class Main {

    private static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of employees: ");
        Integer numberOfEmployees = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("\nEmployee #%d data:\n", i + 1);
            System.out.print("Outsourced (y/n): ");
            String option = sc.nextLine();

            System.out.printf("Name: ");
            String name = sc.nextLine();

            System.out.printf("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();

            System.out.printf("Value per Hour: ");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();

            switch (option) {
                case "y":
                    System.out.printf("Additional Charge: ");
                    Double additionalCharge = sc.nextDouble();
                    sc.nextLine();

                    employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
                    break;
                case "n":
                    employees.add(new Employee(name, hours, valuePerHour));
                    break;
            }
        }

        System.out.println("PAYMENTS:");
        employees.forEach(System.out::println);

        sc.close();
    }

    public static Scanner getScannerInstance() {
        return sc;
    }
}
