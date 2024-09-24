package encapsulation.exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner sc = new Scanner(System.in);

        System.out.println("Defina um produto: ");

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        produto.setNome(nome);

        System.out.println("Preço: ");
        float preco = sc.nextFloat();
        sc.nextLine();
        produto.setPreco(preco);

        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        produto.setQuantidade(quantidade);

        System.out.println();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }


}
