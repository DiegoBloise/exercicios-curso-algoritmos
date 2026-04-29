package cursoJava.secao10.ex04;

import java.util.ArrayList;
import java.util.List;

public class NumerosPares {

    private List<Integer> numeros = new ArrayList<>();

    public List<Integer> getNumerosPares() {
        return numeros.stream().filter((n) -> n % 2 == 0).toList();
    }

    public Integer getQtdPares() {
        return numeros.stream().filter((n) -> n % 2 == 0).toList().size();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}
