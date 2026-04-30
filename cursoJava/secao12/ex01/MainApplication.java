package cursoJava.secao12.ex01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import cursoJava.secao12.ex01.models.Department;
import cursoJava.secao12.ex01.models.Worker;
import cursoJava.secao12.ex01.service.DepartmentService;
import cursoJava.secao12.ex01.service.HourContractService;
import cursoJava.secao12.ex01.service.WorkerService;

/*
    Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário).
    Depois, solicitar do usuário um mês e mostrar qual for o salário do funcionário nesse mês.
*/
public class MainApplication {

    private static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Worker worker = registerNewWorker();

        addContractsToWorker(worker);

        calculateWorkerIncome(worker);

        sc.close();
    }

    public static Worker registerNewWorker() {
        WorkerService workerService = new WorkerService();
        DepartmentService departmentService = new DepartmentService();

        Department department = departmentService.create();

        System.out.println();
        System.out.println("Enter worker data: ");

        return workerService.create(department);
    }

    public static void addContractsToWorker(Worker worker) {
        HourContractService contractService = new HourContractService();

        System.out.println();
        System.out.print("How many contracts to this worker?: ");
        Integer numberOfContracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfContracts; i++) {
            System.out.printf("\nEnter contract #%d data:\n", i + 1);
            worker.addContract(contractService.create());
        }
    }

    public static void calculateWorkerIncome(Worker worker) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String incomeInput = sc.nextLine();

        LocalDate incomeDate = LocalDate.parse("01/" + incomeInput, formatter);

        Double workerIncome = worker.income(incomeDate.getYear(), incomeDate.getMonthValue());

        showIncomeReport(worker, incomeDate, workerIncome);
    }

    public static void showIncomeReport(Worker worker, LocalDate date, Double income) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.printf("Name: %s\n", worker.getName());
        System.out.printf("Department: %s\n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f\n", date.format(formatter), income);
    }

    public static Scanner getScannerInstance() {
        return sc;
    }
}
