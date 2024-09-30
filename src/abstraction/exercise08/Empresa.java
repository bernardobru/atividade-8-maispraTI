package abstraction.exercise08;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario func) {
        this.funcionarios.add(func);
    }

    public void removerFuncionario(int indice) {
        this.funcionarios.remove(indice);
    }

    public Funcionario getFuncionario(int indice) {
        return this.funcionarios.get(indice);
    }

    public void setFuncionario(int indice, Funcionario func) {
        this.funcionarios.set(indice, func);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(new Estagiario("joao", 1500, "estagiário"));
        empresa.adicionarFuncionario(new Desenvolvedor("paulo", 5500, "desenvolvedor"));
        empresa.adicionarFuncionario(new Gerente("alberto", 8500, "gerente"));

        Funcionario promocao = empresa.getFuncionario(0).promover();
        System.out.println(empresa.getFuncionario(0).getNome() + empresa.getFuncionario(0).getCargo());

        empresa.setFuncionario(0, promocao);
        System.out.println(empresa.getFuncionario(0).getNome() + empresa.getFuncionario(0).getCargo());

        System.out.println(empresa.getFuncionario(1).getNome() + " " + empresa.getFuncionario(1).getCargo());
        Funcionario promoGerente = empresa.getFuncionario(1).promover();

        empresa.setFuncionario(1, promoGerente);
        System.out.println(empresa.getFuncionario(1).getNome() + " " + empresa.getFuncionario(1).getCargo());

    }
}
