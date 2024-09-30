package abstraction.exercise08;

public abstract class Funcionario {
    private String nome;

    private float salario;

    private String cargo;

    protected abstract float bonus();

    public Funcionario(String nome, float salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public abstract float calcularSalario();

    public abstract float calcularBonus();

    public abstract Funcionario promover();
}
