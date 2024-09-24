package inheritance.exercise03;

public class Gerente extends Funcionario{
    public Gerente(String nome, float salario) {
        super(nome, salario);
    }

    public float calcularBonus() {
        return this.salario * (20.0f / 100.0f);
    }
}
