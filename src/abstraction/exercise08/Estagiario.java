package abstraction.exercise08;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, float salario, String cargo) {
        super(nome, salario, cargo);
    }

    @Override
    protected float bonus() {
        return this.getSalario() * 0.1f;
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
        return new Desenvolvedor(this.getNome(), this.getSalario(), "desenvolvedor");
    }
}
