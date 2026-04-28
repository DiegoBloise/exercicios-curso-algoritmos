package cursoJava.secao8.ex02;

import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
    Em seguida, mostrar os dados do funcionário (nome e salário líquido).
    Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada
    (somente o salário bruto é afetado pela porcentagem) e
    mostrar novamente os dados do funcionário. Use a classe projetada abaixo.

    +----------------------------------------------+
    |                 Employee                     |
    |----------------------------------------------|
    |- Name         : string                       |
    |- GrossSalary  : double                       |
    |- Tax          : double                       |
    |----------------------------------------------|
    | + NetSalary() : double                       |
    | + IncreaseSalary(percentage : double) : void |
    +----------------------------------------------+

*/
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.setName(sc.nextLine());

        System.out.print("Gross salary: ");
        employee.setGrossSalary(sc.nextDouble());
        sc.nextLine();

        System.out.print("Tax: ");
        employee.setTax(sc.nextDouble());
        sc.nextLine();

        System.out.println("\nEmployee: " + employee);

        System.out.print("\nWich percentage to increase salary?: ");
        employee.increaseSalary(sc.nextDouble());
        sc.nextLine();

        System.out.println("\nUpdated data: " + employee);

        sc.close();
    }
}