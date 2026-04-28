package cursoJava.secao9.ex01;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/*
    Em um banco, para se cadastrar uma conta bancária,
    é necessário informar o número da conta, o nome do titular da conta,
    e o valor de depósito inicial que o titular depositou ao abrir a conta.
    Este valor de depósito inicial, entretanto, é opcional, ou seja:
    se o titular não tiver dinheiro a depositar no momento de abrir sua conta,
    o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

    Importante: uma vez que uma conta bancária foi aberta,
    o número da conta nunca poderá ser alterado.
    Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome
    por ocasiãode casamento, por exemplo).

    Por fim, o saldo da conta não pode ser alterado livremente.
    É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos,
    e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $ 5.00.
    Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para
    realizar o saque e/ou pagar a taxa.

    Você deve fazer um programa que realize o cadastro de uma conta,
    dando opção para que seja ou não informado o valor de depósito inicial.
    Em seguida, realizar um depósito e depois um saque,
    sempre mostrando os dados da conta após cada operação.
*/
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        banner("New Account");

        System.out.print("Number: ");
        Long number = sc.nextLong();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Make a initial deposit? [Y/n]: ");
        String opt = sc.nextLine();

        Account account;
        if (opt.equals("Y") || opt.equals("y")) {
            System.out.print("Deposit amount: ");
            BigDecimal initialDeposit = sc.nextBigDecimal();
            account = new Account(number, name, initialDeposit);
        } else {
            account = new Account(number, name);
        }

        banner("Account Info");
        System.out.println(account.toString());

        System.out.println();

        BigDecimal depositValue = new BigDecimal(42);
        banner(String.format("Deposit: $ %.2f", depositValue));
        System.out.printf("Account balance: $ %.2f%n", account.deposit(depositValue));

        System.out.println();

        BigDecimal withdrawValue = new BigDecimal(25);
        banner(String.format("Withdraw: $ %.2f", withdrawValue));
        System.out.printf("Account balance: $ %.2f%n", account.deposit(withdrawValue));

        System.out.println();

        sc.close();
    }

    public static void banner(String title) {
        System.out.println("-=".repeat(15));
        System.out.printf("%" + ((30 + title.length()) / 2) + "s%n", title);
        System.out.println("-=".repeat(15));
    }
}