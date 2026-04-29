package cursoJava.secao10.ex02;

import java.util.ArrayList;
import java.util.List;

public class SomaVetor {

    private List<Double> numeros = new ArrayList<>();

    public Double getSoma() {
        return numeros.stream().reduce(0.0, Double::sum);
    }

    public Double getMedia() {
        return getSoma() / numeros.size();
    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }
}
