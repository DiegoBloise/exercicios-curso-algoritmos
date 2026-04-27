import java.util.Locale;
import java.util.Scanner;

public class Combustivel {

    private Integer alcool;
    private Integer gasolina;
    private Integer diesel;

    public Combustivel() {
        alcool = 0;
        gasolina = 0;
        diesel = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Combustivel combustivel = new Combustivel();

        combustivel.processarVendas(sc);

        sc.close();
    }

    public void processarVendas(Scanner sc) {
        while (true) {
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            Integer opt = sc.nextInt();

            if (opt == 4) {
                break;
            }

            registrar(opt);
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }

    public void registrar(Integer codigo) {
        switch (codigo) {
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

    public Integer getTotal() {
        return alcool + gasolina + diesel;
    }

    public Integer getAlcool() {
        return alcool;
    }

    public void setAlcool(Integer alcool) {
        this.alcool = alcool;
    }

    public Integer getGasolina() {
        return gasolina;
    }

    public void setGasolina(Integer gasolina) {
        this.gasolina = gasolina;
    }

    public Integer getDiesel() {
        return diesel;
    }

    public void setDiesel(Integer diesel) {
        this.diesel = diesel;
    }
}