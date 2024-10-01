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
}
