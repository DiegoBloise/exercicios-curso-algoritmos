package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

    private Double temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Temperatura temperatura = new Temperatura();

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)?: ");
        String escala = sc.nextLine().toUpperCase();

        System.out.printf("Digite a temperatura em %s: ", escala.equals("F") ? "Fahrenheit" : "Celsius");
        temperatura.setTemp(sc.nextDouble());

        // Mantive o switch para ficar mais parecido com a estura original em visualg
        switch (escala) {
            case "F":
                System.out.printf("Temperatura equivalente em Celsius: %.2f", temperatura.getTempInCelsius());
                break;
            case "C":
                System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", temperatura.getTempInFahrenheit());
                break;
            default:
                break;
        }

        sc.close();
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTempInFahrenheit() {
        return (temp * 9 / 5) + 32;
    }

    public Double getTempInCelsius() {
        return (temp - 32) * 5 / 9;
    }
}