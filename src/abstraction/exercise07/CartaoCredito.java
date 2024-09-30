package abstraction.exercise07;

public class CartaoCredito extends FormaPagamento{
    private double limite;

    private double valor;

    public CartaoCredito(double limite) {
        if (limite < 0) {
            throw new IllegalArgumentException("O limite deve ser maior que zero!");
        }

        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {
        this.valor = valor;

        if (validarPagamento()) {
            System.out.println("O pagamento de " + this.valor + " foi aprovado!");
        } else {
            System.out.println("O pagamento não foi aprovado! Valor maior que o limite!");
        }
    }

    @Override
    protected boolean validarPagamento() {
        return !(this.valor <= 0) && !(this.valor > this.limite);
    }
}
