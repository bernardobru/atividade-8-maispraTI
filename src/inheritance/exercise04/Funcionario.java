package inheritance.exercise04;

public class Funcionario {
    protected String nome;

    protected float salario;

    protected Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    protected void trabalhar() {
        System.out.printf("O funcionário %s está trabalhando", this.nome);
    }
}
