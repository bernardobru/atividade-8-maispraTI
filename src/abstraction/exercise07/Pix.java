package abstraction.exercise07;

import java.time.LocalTime;

public class Pix extends FormaPagamento {
    private final String chave;

    private double valor;

    public Pix(String chave) {
        this.chave = chave;
    }

    @Override
    public void processarPagamento(double valor) {
        this.valor = valor;

        if (validarPagamento()) {
            System.out.println("O pagamento de " + valor + " feito para a chave: " + this.chave + " foi aprovado!");
        } else {
            System.out.println("O pix não pode ser menor ou igual a zero!");
        }
    }

    @Override
    protected boolean validarPagamento() {
        return this.valor > 0;
    }
}