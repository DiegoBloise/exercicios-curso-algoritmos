package cursoJava.secao10.ex03;

import java.util.ArrayList;
import java.util.List;

public class Alturas {

    private List<String> nomes = new ArrayList<>();
    private List<Integer> idades = new ArrayList<>();
    private List<Double> alturas = new ArrayList<>();

    public Double getPorcentagemMenores() {
        return Double.valueOf(getQtdMenores()) / alturas.size() * 100;
    }

    public List<String> getNomesMenores() {
        List<String> nomesMenores = new ArrayList<>();
        for (int i = 0; i < nomes.size(); i++) {
            if (idades.get(i) < 16) {
                nomesMenores.add(nomes.get(i));
            }
        }
        return nomesMenores;
    }

    public Integer getQtdMenores() {
        Integer qtdMenores = 0;
        for (int i = 0; i < idades.size(); i++) {
            if (idades.get(i) < 16) {
                qtdMenores++;
            }
        }
        return qtdMenores;
    }

    public Double getMedia() {
        Double soma = 0.0;
        for (int i = 0; i < alturas.size(); i++) {
            soma += alturas.get(i);
        }
        return soma / alturas.size();
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

    public List<Double> getAlturas() {
        return alturas;
    }

    public void setAlturas(List<Double> alturas) {
        this.alturas = alturas;
    }
}