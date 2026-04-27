package cursoJava.exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número do funcionário, horas trabalhadas e valor da hora:");

        int idFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + idFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
