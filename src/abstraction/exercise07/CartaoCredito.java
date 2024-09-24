package abstraction.exercise07;

public class CartaoCredito extends FormaPagamento{
    protected int parcelas;

    private boolean isParcelado;

    private boolean isValido;

    public CartaoCredito(int parcelas) {
        if (parcelas < 0) {
            throw new IllegalArgumentException("Parcelas não podem ser negativas");
        }
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento(double valor) {

        if(valor <= 0) {
            this.isValido = false;
        } else {
            this.isValido = true;
        }
    }

    @Override
    public void validarPagamento() {
        if (isValido) {
            System.out.println("O pagamento foi validado!");
        }
    }

    private boolean isAVista() {
        return this.parcelas == 0 || this.parcelas == 1;
    }
}
