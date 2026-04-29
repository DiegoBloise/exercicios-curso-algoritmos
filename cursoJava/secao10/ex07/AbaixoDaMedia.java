package cursoJava.secao10.ex07;

import java.util.ArrayList;
import java.util.List;

public class AbaixoDaMedia {

    private List<Double> numeros = new ArrayList<>();

    public Double getMedia() {
        Double soma = 0.0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma / numeros.size();
    }

    public List<Double> getAbaixoMedia() {
        return numeros.stream().filter((n) -> n < getMedia()).toList();
    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }
}
