package cursoJava.secao12.ex01.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import cursoJava.secao12.ex01.enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(Department department, String name, WorkerLevel level, Double baseSalary) {
        this.department = department;
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public Double income(Integer year, Integer month) {
        LocalDate date = LocalDate.of(year, month, 1);

        List<HourContract> filteredContracts = contracts.stream()
                .filter(contract -> contract.getDate().getMonth().equals(date.getMonth()))
                .toList();

        Double totalFromContracts = filteredContracts.stream()
                .map(contract -> contract.totalValue())
                .reduce(0.0, Double::sum);

        return baseSalary + totalFromContracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel workerLevel) {
        this.level = workerLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }
}
