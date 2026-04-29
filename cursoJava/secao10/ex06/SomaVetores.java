import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SomaVetores {

    private List<Integer> a = new ArrayList<>();
    private List<Integer> b = new ArrayList<>();

    public List<Integer> getVetorResultante() {
        return IntStream.range(0, a.size())
                .mapToObj(i -> a.get(i) + b.get(i)).toList();
    }

    public List<Integer> getA() {
        return a;
    }

    public void setA(List<Integer> a) {
        this.a = a;
    }

    public List<Integer> getB() {
        return b;
    }

    public void setB(List<Integer> b) {
        this.b = b;
    }
}