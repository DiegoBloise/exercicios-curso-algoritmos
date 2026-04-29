package cursoJava.secao10.ex09;

import java.util.ArrayList;
import java.util.List;

public class MaisVelho {

    private List<String> nomes = new ArrayList<>();
    private List<Integer> idades = new ArrayList<>();

    public Integer getIdadeMaisVelho() {
        return idades.get(getMaisVelhoIndex());
    }

    public String getNomeMaisVelho() {
        return nomes.get(getMaisVelhoIndex());
    }

    public Integer getMaisVelhoIndex() {
        Integer maisVelhoIndex = 0;
        for (int i = 0; i < idades.size(); i++) {
            if (idades.get(i) > idades.get(maisVelhoIndex)) {
                maisVelhoIndex = i;
            }
        }
        return maisVelhoIndex;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public List<Integer> getIdades() {
        return idades;
    }

    public void setIdades(List<Integer> idades) {
        this.idades = idades;
    }
}
