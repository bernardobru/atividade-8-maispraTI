package abstraction.exercise07;

public class Main {
    public static void main(String[] args) {
        Pix pix = new Pix("abdce@gmail.com");
        pix.processarPagamento(0);

        Boleto boleto = new Boleto("12345123456123456123456123451234561123456789123");
        boleto.processarPagamento(2013);

        CartaoCredito cartao = new CartaoCredito(5000);
        cartao.processarPagamento(5021);
    }
}
