package inheritance.exercise03;

public class    Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jose", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Paulo", 7500);

        System.out.println(gerente.salario);
        System.out.println(desenvolvedor.salario);

        System.out.println();

        System.out.println(gerente.calcularBonus());
        System.out.println(desenvolvedor.calcularBonus());
    }
}
