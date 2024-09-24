package inheritance.exercise04;

public class Gerente extends Funcionario {
    public Gerente(String nome, float salario) {
        super(nome, salario);
    }

    public float calcularBonus() {
        return this.salario * (20.0f / 100.0f);
    }

    @Override
    public void trabalhar() {
        System.out.printf("O funcionário %s no cargo de Gerente está gerenciando o departamento", this.nome);
    }
}
