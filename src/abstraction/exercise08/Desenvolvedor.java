package abstraction.exercise08;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, float salario, String cargo) {
        super(nome, salario, cargo);
    }

    @Override
    protected float bonus() {
        return this.getSalario() * 0.2f;
    }

    @Override
    public float calcularSalario() {
        return this.getSalario();
    }

    @Override
    public float calcularBonus() {
        return this.getSalario() + this.bonus();
    }

    @Override
    public Funcionario promover() {
        return new Gerente(this.getNome(), this.getSalario(), "gerente");
    }
}
