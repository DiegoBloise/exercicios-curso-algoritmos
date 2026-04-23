import java.util.Locale;
import java.util.Scanner;

public class Combustivel {

    private int alcool;
    private int gasolina;
    private int diesel;
    private int opt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Combustivel combustivel = new Combustivel();

        combustivel.processarVendas(sc);

        sc.close();
    }

    public void processarVendas(Scanner sc) {
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        opt = 0;

        while (opt != 4) {
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }

    public int getAlcool() {
        return alcool;
    }

    public void setAlcool(int alcool) {
        this.alcool = alcool;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public int getDiesel() {
        return diesel;
    }

    public void setDiesel(int diesel) {
        this.diesel = diesel;
    }

    public int getOpt() {
        return opt;
    }

    public void setOpt(int opt) {
        this.opt = opt;
    }
}
