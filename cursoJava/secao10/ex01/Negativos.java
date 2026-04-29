package cursoJava.secao10.ex01;

import java.util.ArrayList;
import java.util.List;

public class Negativos {

    private List<Integer> numeros = new ArrayList<>();

    public List<Integer> getNumerosNegativos() {
        return numeros.stream().filter((n) -> n < 0).toList();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}