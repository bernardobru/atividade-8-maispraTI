package inheritance.exercise04;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Perdariseas", 153252353.32f);

        Desenvolvedor dev = new Desenvolvedor("Adalberto", 12423.32f);

        Gerente gerente = new Gerente("Malaquias", 15623.52f);

        dev.trabalhar();

        System.out.println();

        gerente.trabalhar();

        System.out.println();

        funcionario.trabalhar();
    }
}
