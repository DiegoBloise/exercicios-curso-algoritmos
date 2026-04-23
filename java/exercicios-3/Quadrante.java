import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

    private double x;
    private double y;
    private String msg;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Quadrante quadrante = new Quadrante();

        quadrante.determinarQuadrante(sc);

        sc.close();
    }

    public void determinarQuadrante(Scanner sc) {
        x = 1;
        y = 1;

        while (x != 0 || y != 0) {
            System.out.println("Digite os valores das coordenadas X e Y:");
            x = sc.nextDouble();
            y = sc.nextDouble();

            if (x > 0) {
                if (y < 0) {
                    msg = "QUADRANTE Q4";
                } else {
                    msg = "QUADRANTE Q1";
                }
            }

            if (x < 0) {
                if (y > 0) {
                    msg = "QUADRANTE Q2";
                } else {
                    msg = "QUADRANTE Q3";
                }
            }

            if (x != 0 || y != 0) {
                System.out.println(msg);
            }
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
