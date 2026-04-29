package cursoJava.secao10.ex10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Aprovados aprovados = new Aprovados();

        System.out.print("Quantos alunos serao digitados?: ");
        Integer n = sc.nextInt();

        // Limpar buffer
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            aprovados.getAlunos().add(sc.nextLine());
            aprovados.getNotas1().add(sc.nextDouble());
            aprovados.getNotas2().add(sc.nextDouble());

            // Limpar buffer
            sc.nextLine();
        }

        System.out.println("Alunos aprovados:");
        for (String aluno : aprovados.getAprovados()) {
            System.out.println(aluno);
        }

        sc.close();
    }
}
