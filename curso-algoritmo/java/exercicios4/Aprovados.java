import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Aprovados {

    private List<String> alunos = new ArrayList<>();
    private List<Double> notas1 = new ArrayList<>();
    private List<Double> notas2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Aprovados aprovados = new Aprovados();

        System.out.print("Quantos alunos serao digitados?: ");
        Integer n = sc.nextInt();

        // Limpar buffer
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            aprovados.getAlunos().add(sc.nextLine());
            aprovados.getNotas1().add(sc.nextDouble());
            aprovados.getNotas2().add(sc.nextDouble());

            // Limpar buffer
            sc.nextLine();
        }

        System.out.println("Alunos aprovados:");
        for (String aluno : aprovados.getAprovados()) {
            System.out.println(aluno);
        }

        sc.close();
    }

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
