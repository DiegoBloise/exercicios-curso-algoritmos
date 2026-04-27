import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {

    private Integer num1, num2, num3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MenorDeTres menorDeTres = new MenorDeTres();

        System.out.print("Primeiro valor: ");
        menorDeTres.setNum1(sc.nextInt());

        System.out.print("Segundo valor: ");
        menorDeTres.setNum2(sc.nextInt());

        System.out.print("Terceiro valor: ");
        menorDeTres.setNum3(sc.nextInt());

        System.out.printf("MENOR = %d", menorDeTres.getMenor());

        sc.close();
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer getNum3() {
        return num3;
    }

    public void setNum3(Integer num3) {
        this.num3 = num3;
    }

    public Integer getMenor() {
        if (num1 < num2 && num1 < num3) {
            return num1;
        }

        if (num2 < num1 && num2 < num3) {
            return num2;
        }

        return num3;
    }
}