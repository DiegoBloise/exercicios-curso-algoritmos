import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

    private Integer codigoProduto;
    private Integer qtdProduto;
    private Double valorProduto;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Lanchonete lanchonete = new Lanchonete();

        System.out.print("Codigo do produto comprado: ");
        lanchonete.setCodigoProduto(sc.nextInt());

        System.out.print("Quantidade comprada: ");
        lanchonete.setQtdProduto(sc.nextInt());

        System.out.printf("Valor a pagar: R$ %.2f", lanchonete.getTotal());

        sc.close();
    }

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(Integer qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Double getTotal() {
        switch (codigoProduto) {
            case 1:
                valorProduto = 5.00;
                break;
            case 2:
                valorProduto = 3.50;
                break;
            case 3:
                valorProduto = 4.80;
                break;
            case 4:
                valorProduto = 8.90;
                break;
            case 5:
                valorProduto = 7.32;
                break;
            default:
                break;
        }
        return valorProduto * qtdProduto;
    }
}
