package abstraction.exercise08;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.adicionarFuncionario(new Estagiario("Pedro", 1500, "estagiário"));
        empresa.adicionarFuncionario(new Desenvolvedor("José", 5000, "desenvolvedor"));
        empresa.adicionarFuncionario(new Gerente("Carlos", 7500, "gerente"));

        System.out.println("Antes da promoção: ");
        System.out.println(empresa.getFuncionario(0).getNome());
        System.out.println(empresa.getFuncionario(0).getCargo());
        System.out.println(empresa.getFuncionario(0).getSalario());

        System.out.println();

        System.out.println("Depois da promoção: ");
        empresa.setFuncionario(0, empresa.getFuncionario(0).promover());
        System.out.println(empresa.getFuncionario(0).getNome());
        System.out.println(empresa.getFuncionario(0).getCargo());
        System.out.println(empresa.getFuncionario(0).getSalario());


        System.out.println();

        System.out.println("Antes da promoção: ");
        System.out.println(empresa.getFuncionario(1).getNome());
        System.out.println(empresa.getFuncionario(1).getCargo());
        System.out.println(empresa.getFuncionario(1).getSalario());

        System.out.println();

        System.out.println("Depois da promoção: ");
        empresa.setFuncionario(1, empresa.getFuncionario(1).promover());
        System.out.println(empresa.getFuncionario(1).getNome());
        System.out.println(empresa.getFuncionario(1).getCargo());
        System.out.println(empresa.getFuncionario(1).getSalario());

        System.out.println();

        System.out.println("Antes da promoção: ");
        System.out.println(empresa.getFuncionario(2).getNome());
        System.out.println(empresa.getFuncionario(2).getCargo());
        System.out.println(empresa.getFuncionario(2).getSalario());
        System.out.println("GERENTE NÃO PODE SER PROMOVIDO");

        System.out.println();

        System.out.println("FOLHA DE PAGAMENTO DA EMPRESA: ");
        System.out.println(empresa.calcularFolhaPagamento(empresa.getFuncionarios()));
    }
}
