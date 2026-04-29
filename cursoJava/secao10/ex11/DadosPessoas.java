package cursoJava.secao10.ex11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DadosPessoas {

    private List<Double> alturas = new ArrayList<>();
    private List<String> generos = new ArrayList<>();

    public Double getMenorAltura() {
        return alturas.stream().min(Double::compare).get();
    }

    public Double getMaiorAltura() {
        return alturas.stream().max(Double::compare).get();
    }

    public Double getMediaAlturaMulheres() {
        double soma = IntStream
                .range(0, alturas.size())
                .filter(i -> generos.get(i).equals("F"))
                .mapToObj(i -> alturas.get(i))
                .reduce(0.0, Double::sum);
        long qtdMulheres = generos.stream().filter(g -> g.equals("F")).count();
        if (qtdMulheres == 0) {
            return 0.0;
        }
        return soma / qtdMulheres;
    }

    public Integer getTotalHomens() {
        return generos.stream().filter((g) -> g.equals("M")).toList().size();
    }

    public List<Double> getAlturas() {
        return alturas;
    }

    public void setAlturas(List<Double> alturas) {
        this.alturas = alturas;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }
}