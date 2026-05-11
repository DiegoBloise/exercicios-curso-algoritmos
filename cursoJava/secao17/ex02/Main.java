package cursoJava.secao17.ex02;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/*
    Em um portal de cursos online, cada usuário possui um código único,
    representado por um número inteiro.

    Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno
    pode se matricular em quantos cursos quiser. Assim, o npumero total de alunos
    de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui,
    pois pode haver alunos repetidos em mais de um curso.

    O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.

    Seu programa deve ler os alunos dos cursos A, B e C do instrutor Aex, depois mostrar
    a quantidade total e alunos dele.
*/
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        System.out.println("How many students for course A?: ");
        Integer courseStudents = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < courseStudents; i++) {
            courseA.add(sc.nextInt());
        }
        sc.nextLine();

        Set<Integer> courseB = new HashSet<>();
        System.out.println("How many students for course B?: ");
        courseStudents = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < courseStudents; i++) {
            courseB.add(sc.nextInt());
        }
        sc.nextLine();

        Set<Integer> courseC = new HashSet<>();
        System.out.println("How many students for course C?: ");
        courseStudents = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < courseStudents; i++) {
            courseC.add(sc.nextInt());
        }
        sc.nextLine();

        sc.close();

        Set<Integer> students = new HashSet<>();

        students.addAll(courseA);
        students.addAll(courseB);
        students.addAll(courseC);

        System.out.println("Total students: " + students.size());
    }
}
