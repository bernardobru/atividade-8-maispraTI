package inheritance.exercise04;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, float salario) {
        super(nome, salario);
    }

    public float calcularBonus() {
        return this.salario * (10.0f / 100.0f);
    }

    @Override
    public void trabalhar() {
        System.out.println("O funcionário " + this.nome + " no cargo de Desenvolvedor está desenvolvendo em seu projeto");
    }
}
