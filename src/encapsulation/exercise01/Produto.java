package encapsulation.exercise01;

public class Produto {
    private String nome;

    private float preco;

    private int quantidade;

    public String getNome() {
        return this.nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Valor do preço do produto não pode ser negativo!");
        }

        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade de produtos não pode ser negativa!");
        }

        this.quantidade = quantidade;
    }
}
