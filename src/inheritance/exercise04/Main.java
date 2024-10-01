package inheritance.exercise04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario func;
        Desenvolvedor dev;
        Gerente ger;

        System.out.println("Digite o nome do funcionário: ");
        String funcNome = sc.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        float funcSal = sc.nextFloat();
        sc.nextLine();
        func = new Funcionario(funcNome, funcSal);

        System.out.println("Digite o nome do desenvolvedor: ");
        String devNome = sc.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        float devSal = sc.nextFloat();
        sc.nextLine();
        dev = new Desenvolvedor(devNome, devSal);

        System.out.println("Digite o nome do gerente: ");
        String gerNome = sc.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        float gerSal = sc.nextFloat();
        sc.nextLine();
        ger = new Gerente(gerNome, gerSal);

        System.out.println();

        func.trabalhar();
        dev.trabalhar();
        ger.trabalhar();
    }
}
