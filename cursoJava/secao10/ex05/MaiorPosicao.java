import java.util.ArrayList;
import java.util.List;

public class MaiorPosicao {

    private List<Double> numeros = new ArrayList<>();

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }

    public Double getMaior() {
        return numeros.stream().max(Double::compare).get();
    }

    public Integer getMaiorIndex() {
        Integer maiorIndex = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > numeros.get(maiorIndex)) {
                maiorIndex = i;
            }
        }
        return maiorIndex;
    }
}