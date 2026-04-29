package cursoJava.secao10.ex13;

import java.math.BigDecimal;

public class Employee {

    private Long id;
    private String name;
    private BigDecimal salary;

    public Employee(Long id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(Double percent) {
        BigDecimal increaseAmount = salary.multiply(BigDecimal.valueOf(percent / 100));
        salary = salary.add(increaseAmount);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, $ %.2f", id, name, salary);
    }
}
