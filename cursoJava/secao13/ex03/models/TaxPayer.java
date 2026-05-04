package cursoJava.secao13.ex03.models;

public abstract class TaxPayer {

    private String name;

    private Double anualIncome;

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public Double tax() {
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
}
