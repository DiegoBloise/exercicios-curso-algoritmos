package cursoJava.secao10.ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Aprovados {

    private List<String> alunos = new ArrayList<>();
    private List<Double> notas1 = new ArrayList<>();
    private List<Double> notas2 = new ArrayList<>();

    public List<String> getAprovados() {
        return IntStream
                .range(0, alunos.size())
                .filter(i -> (notas1.get(i) + notas2.get(i)) / 2 >= 6)
                .mapToObj(i -> alunos.get(i)).toList();
    }

    public List<String> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<String> alunos) {
        this.alunos = alunos;
    }

    public List<Double> getNotas1() {
        return notas1;
    }

    public void setNotas1(List<Double> notas1) {
        this.notas1 = notas1;
    }

    public List<Double> getNotas2() {
        return notas2;
    }

    public void setNotas2(List<Double> notas2) {
        this.notas2 = notas2;
    }
}
