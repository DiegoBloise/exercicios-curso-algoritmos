package cursoJava.secao14.ex01;

import java.util.Scanner;

import cursoJava.secao14.ex01.exceptions.WithdrawException;
import cursoJava.secao14.ex01.models.Account;

/*
    Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta
    conta bancária, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo
    na conta, ou se o valor do saque for superior ao limite de saque da conta.
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");

        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial Balance: ");
        Double initialBalance = sc.nextDouble();
        sc.nextLine();

        System.out.print("Withdraw Limit: ");
        Double withdrawLimit = sc.nextDouble();
        sc.nextLine();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        try {
            System.out.println("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());
            sc.nextLine();
        } catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("New balance: $%.2f", account.getBalance());

        sc.close();
    }
}