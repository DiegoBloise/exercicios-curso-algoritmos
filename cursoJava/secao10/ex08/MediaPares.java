package cursoJava.secao10.ex08;

import java.util.ArrayList;
import java.util.List;

public class MediaPares {

    private List<Integer> numeros = new ArrayList<>();

    public Double getMediaPares() {
        if (getTotalPares() == 0) {
            return 0.0;
        }
        return (double) getSomaPares() / getTotalPares();
    }

    public Integer getSomaPares() {
        return numeros.stream().filter((n) -> n % 2 == 0).reduce(0, Integer::sum);
    }

    public Integer getTotalPares() {
        return numeros.stream().filter((n) -> n % 2 == 0).toList().size();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}