package exercicios4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Comerciante {

    private List<String> produtos = new ArrayList<>();
    private List<BigDecimal> precosCompra = new ArrayList<>();
    private List<BigDecimal> precosVenda = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Comerciante comerciante = new Comerciante();

        System.out.print("Serao digitados dados de quantos produtos?: ");
        Integer n = sc.nextInt();

        // Limpar buffer
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Produto %d:\n", i + 1);
            System.out.print("Nome: ");
            comerciante.getProdutos().add(sc.nextLine());

            System.out.print("Preco de compra: ");
            comerciante.getPrecosCompra().add(sc.nextBigDecimal());

            System.out.print("Preco de venda: ");
            comerciante.getPrecosVenda().add(sc.nextBigDecimal());

            // Limpar buffer
            sc.nextLine();
        }

        System.out.println("\nRELATORIO:");
        System.out.println("Lucro abaixo de 10%: " + comerciante.getLucroBaixo());
        System.out.println("Lucro entre 10% e 20%: " + comerciante.getLucroMedio());
        System.out.println("Lucro acima de 20%: " + comerciante.getLucroAlto());
        System.out.printf("Valor total de compra: %.2f\n", comerciante.getTotalCompra());
        System.out.printf("Valor total de venda: %.2f\n", comerciante.getTotalVenda());
        System.out.printf("Lucro total: %.2f\n", comerciante.getTotalLucro());

        sc.close();
    }

    public Integer getLucroBaixo() {
        Integer lucroBaixo = 0;
        for (int i = 0; i < produtos.size(); i++) {
            BigDecimal lucro = precosVenda.get(i).subtract(precosCompra.get(i));
            Double percentLucro = lucro.divide(precosCompra.get(i), 2, RoundingMode.HALF_UP)
                    .multiply(BigDecimal.valueOf(100))
                    .doubleValue();
            if (percentLucro < 10) {
                lucroBaixo++;
            }
        }
        return lucroBaixo;
    }

    public Integer getLucroMedio() {
        Integer lucroMedio = 0;
        for (int i = 0; i < produtos.size(); i++) {
            BigDecimal lucro = precosVenda.get(i).subtract(precosCompra.get(i));
            Double percentLucro = lucro.divide(precosCompra.get(i), 2, RoundingMode.HALF_UP)
                    .multiply(BigDecimal.valueOf(100))
                    .doubleValue();
            if (percentLucro >= 10 && percentLucro <= 20) {
                lucroMedio++;
            }
        }
        return lucroMedio;
    }

    public Integer getLucroAlto() {
        Integer lucroAlto = 0;
        for (int i = 0; i < produtos.size(); i++) {
            BigDecimal lucro = precosVenda.get(i).subtract(precosCompra.get(i));
            Double percentLucro = lucro.divide(precosCompra.get(i), 2, RoundingMode.HALF_UP)
                    .multiply(BigDecimal.valueOf(100))
                    .doubleValue();
            if (percentLucro > 20) {
                lucroAlto++;
            }
        }
        return lucroAlto;
    }

    public BigDecimal getTotalCompra() {
        BigDecimal totalCompra = BigDecimal.ZERO;
        for (int i = 0; i < precosCompra.size(); i++) {
            totalCompra = totalCompra.add(precosCompra.get(i));
        }
        return totalCompra;
    }

    public BigDecimal getTotalVenda() {
        BigDecimal totalVenda = BigDecimal.ZERO;
        for (int i = 0; i < precosVenda.size(); i++) {
            totalVenda = totalVenda.add(precosVenda.get(i));
        }
        return totalVenda;
    }

    public BigDecimal getTotalLucro() {
        return getTotalVenda().subtract(getTotalCompra());
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public List<BigDecimal> getPrecosCompra() {
        return precosCompra;
    }

    public void setPrecosCompra(List<BigDecimal> precosCompra) {
        this.precosCompra = precosCompra;
    }

    public List<BigDecimal> getPrecosVenda() {
        return precosVenda;
    }

    public void setPrecosVenda(List<BigDecimal> precosVenda) {
        this.precosVenda = precosVenda;
    }
}