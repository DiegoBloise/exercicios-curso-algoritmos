package cursoJava.secao8.ex03;

import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler o nome de um aluno e as três notas
    que ele obteve nos três trimestres do ano
    (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
    Ao final, mostrar qual a nota final do aluno no ano.
    Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e,
    em caso negativo, quantos pontos faltam para o aluno obter o mínimo
    para ser aprovado (que é 60% da nota).
    Você deve criar uma classe Student para resolver este problema.
*/
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.setName(sc.nextLine());

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Grade %d: ", i);
            student.addGrade(sc.nextDouble());
        }

        System.out.printf("\nFINAL GRADE = %.2f\n", student.getFinalGrade());
        System.out.println(student.getStatus());

        sc.close();
    }
}