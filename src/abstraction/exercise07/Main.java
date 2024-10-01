package abstraction.exercise07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE PAGAMENTOS");
        System.out.println("ESCOLHA SUA FORMA DE PAGAMENTO: (1 PARA BOLETO, 2 PARA CARTÃO DE CRÉDITO, 3 PARA PIX) ");
        int forma = sc.nextInt();
        sc.nextLine();
        switch (forma) {
            case 1:
                System.out.println("Insira o código de barras do boleto (contém 48 caracteres)");
                String codigoDeBarras = sc.nextLine();
                FormaPagamento boleto = new Boleto(codigoDeBarras);

                System.out.println("Valor a pagar: ");
                double valorBoleto = sc.nextDouble();
                sc.nextLine();
                boleto.processarPagamento(valorBoleto);
                break;
            case 2:
                System.out.println("Insira o limite de seu cartão: ");
                double limite = sc.nextDouble();
                FormaPagamento cartao = new CartaoCredito(limite);

                System.out.println("Valor a pagar: ");
                double valorCartao = sc.nextDouble();
                sc.nextLine();
                cartao.processarPagamento(valorCartao);
                break;
            case 3:
                System.out.println("Insira a chave pix do recebedor: ");
                String chave = sc.nextLine();
                FormaPagamento pix = new Pix(chave);

                System.out.println("Valor a pagar: ");
                double valorPix = sc.nextDouble();
                sc.nextLine();
                pix.processarPagamento(valorPix);
                break;
            default:
                System.out.println("Forma inválida!");
                break;
        }

    }
}
