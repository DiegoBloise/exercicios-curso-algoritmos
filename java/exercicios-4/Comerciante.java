import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Comerciante {

    private List<String> produtos;
    private List<BigDecimal> precosCompra;
    private List<BigDecimal> precosVenda;

    private Integer lucroBaixo;
    private Integer lucroMedio;
    private Integer lucroAlto;

    private BigDecimal totalCompra;
    private BigDecimal totalVenda;
    private BigDecimal totalLucro;

    private BigDecimal lucro;
    private Double percentLucro;

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

        comerciante.gerarRelatorio();

        sc.close();
    }

    public Comerciante() {
        produtos = new ArrayList<>();
        precosCompra = new ArrayList<>();
        precosVenda = new ArrayList<>();
        lucroBaixo = 0;
        lucroMedio = 0;
        lucroAlto = 0;
        totalCompra = BigDecimal.ZERO;
        totalVenda = BigDecimal.ZERO;
        totalLucro = BigDecimal.ZERO;
    }

    public void gerarRelatorio() {
        calcular();

        StringBuffer buffer = new StringBuffer()
                .append(System.lineSeparator())
                .append("RELATORIO:").append(System.lineSeparator())
                .append(String.format("Lucro abaixo de 10%%: %d", lucroBaixo)).append(System.lineSeparator())
                .append(String.format("Lucro entre 10%% e 20%%: %d", lucroMedio)).append(System.lineSeparator())
                .append(String.format("Lucro acima de 20%%: %d", lucroAlto)).append(System.lineSeparator())
                .append(String.format("Valor total de compra: R$ %.2f", totalCompra)).append(System.lineSeparator())
                .append(String.format("Valor total de venda: R$ %.2f", totalVenda)).append(System.lineSeparator())
                .append(String.format("Lucro total: R$ %.2f", totalLucro));

        System.out.println(buffer);
    }

    private void calcular() {
        for (int i = 0; i < produtos.size(); i++) {
            lucro = precosVenda.get(i).subtract(precosCompra.get(i));
            percentLucro = lucro.divide(precosCompra.get(i), 2, RoundingMode.HALF_UP)
                    .multiply(BigDecimal.valueOf(100))
                    .doubleValue();

            System.out.println(percentLucro);

            if (percentLucro < 10) {
                lucroBaixo++;
            } else if (percentLucro <= 20) {
                lucroMedio++;
            } else {
                lucroAlto++;
            }

            totalCompra = totalCompra.add(precosCompra.get(i));
            totalVenda = totalVenda.add(precosVenda.get(i));
            totalLucro = totalLucro.add(lucro);
        }
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

    public Integer getLucroBaixo() {
        return lucroBaixo;
    }

    public void setLucroBaixo(Integer lucroBaixo) {
        this.lucroBaixo = lucroBaixo;
    }

    public Integer getLucroMedio() {
        return lucroMedio;
    }

    public void setLucroMedio(Integer lucroMedio) {
        this.lucroMedio = lucroMedio;
    }

    public Integer getLucroAlto() {
        return lucroAlto;
    }

    public void setLucroAlto(Integer lucroAlto) {
        this.lucroAlto = lucroAlto;
    }

    public BigDecimal getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(BigDecimal totalCompra) {
        this.totalCompra = totalCompra;
    }

    public BigDecimal getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(BigDecimal totalVenda) {
        this.totalVenda = totalVenda;
    }

    public BigDecimal getTotalLucro() {
        return totalLucro;
    }

    public void setTotalLucro(BigDecimal totalLucro) {
        this.totalLucro = totalLucro;
    }

    public BigDecimal getLucro() {
        return lucro;
    }

    public void setLucro(BigDecimal lucro) {
        this.lucro = lucro;
    }

    public Double getPercentLucro() {
        return percentLucro;
    }

    public void setPercentLucro(Double percentLucro) {
        this.percentLucro = percentLucro;
    }
}