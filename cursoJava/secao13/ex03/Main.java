package cursoJava.secao13.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cursoJava.secao13.ex03.models.Company;
import cursoJava.secao13.ex03.models.Individual;
import cursoJava.secao13.ex03.models.TaxPayer;

/*
    Fazer um programa para ler os dados de $N$ contribuintes ($N$ fornecido pelo usuário),
    os quais podem ser pessoa física ou pessoa jurídica,
    e depois mostrar o valor do imposto pago por cada um,
    bem como o total de imposto arrecadado.

    Os dados de pessoa física são: nome, renda anual e gastos com saúde.
    Os dados de pessoa jurídica são nome, renda anual e número de funcionários.
    As regras para cálculo de imposto são as seguintes:

    Pessoa física: pessoas cuja renda foi abaixo de $20000.00$ pagam $15\%$ de imposto.
    Pessoas com renda de $20000.00$ em diante pagam $25\%$ de imposto.
    Se a pessoa teve gastos com saúde, $50\%$ destes gastos são abatidos no imposto.
    Exemplo: uma pessoa cuja renda foi $50000.00$ e teve $2000.00$ em gastos com saúde,
    o imposto fica: $(50000 \times 25\%) - (2000 \times 50\%) = 11500.00$

    Pessoa jurídica: pessoas jurídicas pagam $16\%$ de imposto. Porém, se a empresa
    possuir mais de $10$ funcionários, ela paga $14\%$ de imposto.
    Exemplo: uma empresa cuja renda foi $400000.00$ e possui $25$ funcionários,
    o imposto fica: $400000 \times 14\% = 56000.00$
*/
public class Main {

    private static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of tax payers: ");
        Integer numberOfTaxPayers = sc.nextInt();
        sc.nextLine();

        List<TaxPayer> taxPayers = new ArrayList<>();
        for (int i = 0; i < numberOfTaxPayers; i++) {
            System.out.printf("\nTax payer #%d data:\n", i + 1);

            System.out.print("Individual or company (i/c)?: ");
            String option = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            sc.nextLine();

            switch (option) {
                case "i":
                    System.out.print("Health expenditures: ");
                    Double healthExpenditures = sc.nextDouble();
                    sc.nextLine();
                    taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
                    break;
                case "c":
                    System.out.print("Number of Employees: ");
                    Integer numberOfEmployees = sc.nextInt();
                    sc.nextLine();
                    taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
                    break;
            }
        }

        System.out.println("\nTAXES PAID:");

        Double totalTaxes = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
            Double tax = 0.0;

            if (taxPayer instanceof Individual) {
                if (taxPayer.getAnualIncome() < 20000.0) {
                    tax = taxPayer.getAnualIncome() * 0.15;
                } else {
                    tax = taxPayer.getAnualIncome() * 0.25;
                }

                if (((Individual) taxPayer).getHealthExpenditures() > 0) {
                    tax -= ((Individual) taxPayer).getHealthExpenditures() / 2;
                }
            } else if (taxPayer instanceof Company) {
                if (((Company) taxPayer).getNumberOfEmployees() > 10) {
                    tax = taxPayer.getAnualIncome() * 0.14;
                } else {
                    tax = taxPayer.getAnualIncome() * 0.16;
                }
            }

            System.out.printf("%s: $%.2f\n", taxPayer.getName(), tax);

            totalTaxes += tax;
        }

        System.out.printf("\nTOTAL TAXES: $%.2f\n", totalTaxes);

        sc.close();
    }

    public static Scanner getScannerInstance() {
        return sc;
    }
}
