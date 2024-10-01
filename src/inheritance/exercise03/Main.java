package inheritance.exercise03;

import java.util.Scanner;

public class    Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Desenvolvedor dev;
        Gerente mng;

        System.out.println("Digite o nome do desenvolvedor: ");
        String desenvolvedor = sc.nextLine();

        System.out.println("Digite o salário de " + desenvolvedor + ": ");
        float salarioDev = sc.nextFloat();
        sc.nextLine();

        System.out.println();

        System.out.println("Digite o nome do gerente: ");
        String gerente = sc.nextLine();

        System.out.println("Digite o salário de " + gerente + ": ");
        float salarioGerente = sc.nextFloat();
        sc.nextLine();
        System.out.println();

        dev = new Desenvolvedor(desenvolvedor, salarioDev);
        mng = new Gerente(gerente, salarioGerente);

        System.out.println("Salário do desenvolvedor " + dev.getNome() + " com bônus: " + dev.calcularBonus());

        System.out.println("Salário do gerente " + mng.getNome() + " com bônus: " + mng.calcularBonus());
    }
}
