package abstraction.exercise08;

public class Gerente extends Funcionario{
    public Gerente(String nome, float salario, String cargo) {
        super(nome, salario, cargo);
    }

    @Override
    protected float bonus() {
        return this.getSalario() * 0.3f;
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
        return null;
    }
}

