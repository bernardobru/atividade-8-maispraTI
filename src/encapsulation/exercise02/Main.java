package encapsulation.exercise02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Defina um produto: ");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Preço: ");
        float preco = sc.nextFloat();
        sc.nextLine();

        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        Desconto produto = new Desconto(nome, preco, quantidade);

        System.out.println();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Preço total: R$" + (produto.getQuantidade() * produto.getPreco()));
        System.out.println();

        System.out.println("Aplicar desconto: ");
        System.out.println("Porcentagem: ");
        double porcentagem = sc.nextDouble();
        sc.nextLine();
        produto.aplicarDesconto(porcentagem);
        System.out.printf("Preço de " + produto.getNome() + " com desconto: R$ %.2f", produto.getPrecoComDesconto());
    }
}
