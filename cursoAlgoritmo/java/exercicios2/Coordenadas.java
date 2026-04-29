package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

    private Double x, y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Coordenadas coordenadas = new Coordenadas();

        System.out.print("Valor de X: ");
        coordenadas.setX(sc.nextDouble());
        System.out.print("Valor de Y: ");
        coordenadas.setY(sc.nextDouble());

        System.out.println(coordenadas.getQuadrante());

        sc.close();
    }

    public String getQuadrante() {
        if (this.x > 0 && this.y > 0) {
            return "Q1";
        } else if (this.x < 0 && this.y > 0) {
            return "Q2";
        } else if (this.x < 0 && this.y < 0) {
            return "Q3";
        } else if (this.x > 0 && this.y < 0) {
            return "Q4";
        } else if (this.x == 0 && this.y != 0) {
            return "Eixo Y";
        } else if (this.y == 0 && this.x != 0) {
            return "Eixo X";
        }
        return "Origem";
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