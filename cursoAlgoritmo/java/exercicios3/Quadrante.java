package exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

    private Double x;
    private Double y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Quadrante quadrante = new Quadrante();

        quadrante.determinarQuadrante(sc);

        sc.close();
    }

    public void determinarQuadrante(Scanner sc) {
        while (true) {
            System.out.println("Digite os valores das coordenadas X e Y:");
            x = sc.nextDouble();
            y = sc.nextDouble();

            if (isEixo()) {
                break;
            }

            System.out.println(getQuadrante());
        }
    }

    public String getQuadrante() {
        if (x > 0 && y > 0) {
            return "QUADRANTE Q1";
        } else if (x < 0 && y > 0) {
            return "QUADRANTE Q2";
        } else if (x < 0 && y < 0) {
            return "QUADRANTE Q3";
        } else {
            return "QUADRANTE Q4";
        }
    }

    public Boolean isEixo() {
        return x == 0 || y == 0;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}