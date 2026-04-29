package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    private Double distanciaPercorrida;
    private Double combustivelGasto;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Consumo consumo = new Consumo();

        System.out.print("Distancia percorrida: ");
        consumo.setDistanciaPercorrida(sc.nextDouble());

        System.out.print("Combustivel gasto: ");
        consumo.setCombustivelGasto(sc.nextDouble());

        System.out.printf("Consumo medio = %.3f", consumo.getConsumoMedio());

        sc.close();
    }

    public Double getConsumoMedio() {
        return this.distanciaPercorrida / this.combustivelGasto;
    }

    public Double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(Double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public Double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(Double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }
}
