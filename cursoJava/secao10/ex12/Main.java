package cursoJava.secao10.ex12;

import java.util.Locale;
import java.util.Scanner;

/*
    A dona de um pensionato possui dez quartos para alugar para estudantes,
    sendo esses quartos identificados pelos números 0 a 9.

    Fazer um programa que inicie com todos os dez quartos vazios,
    e depois leia uma quantidade N representando o número de estudantes
    que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel
    dos N estudantes. Para cada registro de aluguel, informar o nome e email do estudante,
    bem como qual dos quartos ele escolheu (de 0 a 9).
    Suponha que seja escolhido um quarto vago. Ao final,
    seu programa deve imprimir um relatório de todas ocupações do pensionato,
    por ordem de quarto, conforme exemplo.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        BoardingHouse boardingHouse = new BoardingHouse();

        System.out.print("How many rooms will be rented: ");
        Integer totalRent = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalRent; i++) {
            System.out.println(boardingHouse.getBusyRooms());

            System.out.printf("\nRent #%d\n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            Student student = new Student(name, email);

            while (true) {
                System.out.print("Room: ");
                Integer number = sc.nextInt();
                sc.nextLine();

                if (boardingHouse.rentRoom(number, student)) {
                    break;
                }

                System.out.println("This room is already taken, please choose another room.");
                System.out.println("Available rooms: " + boardingHouse.getAvailableRooms());
            }
        }

        System.out.println(boardingHouse.getBusyRooms());
        System.out.println("Available rooms: " + boardingHouse.getAvailableRooms());

        sc.close();
    }
}
