package cursoJava.secao8.ex03;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final Double MIN_GRADE = 60.0;

    private String name;
    private List<Double> grades = new ArrayList<>();

    public Student() {

    }

    public Double getFinalGrade() {
        return grades.stream().reduce(0.0, Double::sum);
    }

    public void addGrade(Double grade) {
        this.grades.add(grade);
    }

    public Boolean isPassed() {
        return getFinalGrade() > MIN_GRADE;
    }

    public String getStatus() {
        return isPassed() ? "PASS" : String.format("FAILED\nMISSING %.2f POINTS", getRemainingGrade());
    }

    public Double getRemainingGrade() {
        return MIN_GRADE > getFinalGrade() ? MIN_GRADE - getFinalGrade() : 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }
}
