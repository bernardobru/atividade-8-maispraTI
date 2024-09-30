package abstraction.exercise07;

public class Boleto extends FormaPagamento {
    private final String codigoDeBarras;

    private double valor;

    public Boleto(String codigo) {
        this.codigoDeBarras = codigo;
    }

    @Override
    public void processarPagamento(double valor) {
        this.valor = valor;

        if (validarPagamento()) {
            System.out.println("O pagamento de " + this.valor + " foi aprovado!");
        } else {
            System.out.println("O pagamento não foi aprovado!");
        }
    }

    @Override
    protected boolean validarPagamento() {
        return this.codigoDeBarras.length() == 48 && this.valor > 0;
    }
}
