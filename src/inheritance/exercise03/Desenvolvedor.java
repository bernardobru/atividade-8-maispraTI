package inheritance.exercise03;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, float salario) {
        super(nome, salario);
    }

    public float calcularBonus() {
        return this.salario * (10.0f / 100.0f);
    }
}
