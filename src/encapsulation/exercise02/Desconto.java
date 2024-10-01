package encapsulation.exercise02;

public class Desconto extends Produto {
    public Desconto(String nome, float preco, int quantidade) {
        super();
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    private double precoComDesconto;

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem < 50) {
            throw new IllegalArgumentException("Porcentagem de desconto não pode ser menor que zero e maior que cinquenta");
        }

        this.precoComDesconto = this.getPreco() * (porcentagem / 100);
    }

    public double getPrecoComDesconto() {
        return this.precoComDesconto;
    }
}
