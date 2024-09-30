package abstraction.exercise07;

public abstract class FormaPagamento {
    public abstract void processarPagamento(double valor);

    abstract boolean validarPagamento();
}
