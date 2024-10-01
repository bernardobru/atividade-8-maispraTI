package abstraction.exercise08;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.adicionarFuncionario(new Estagiario("Pedro", 1500f, "estagiário"));
        empresa.adicionarFuncionario(new Desenvolvedor("José", 5000, "desenvolvedor"));
        empresa.adicionarFuncionario(new Gerente("Carlos", 7500, "gerente"));

        System.out.println("Antes da promoção: ");
        System.out.println(empresa.getFuncionario(0).getNome());
        System.out.println(empresa.getFuncionario(0).getCargo());
        System.out.println(empresa.getFuncionario(0).getSalario());

        System.out.println();

        System.out.println("Depois da promoção: ");
        System.out.println(empresa.getFuncionario(0).promover().getNome());
        System.out.println(empresa.getFuncionario(0).promover().getCargo());
        System.out.println(empresa.getFuncionario(0).promover().getSalario());

        System.out.println();

        System.out.println("Antes da promoção: ");
        System.out.println(empresa.getFuncionario(1).getNome());
        System.out.println(empresa.getFuncionario(1).getCargo());
        System.out.println(empresa.getFuncionario(1).getSalario());

        System.out.println();

        System.out.println("Depois da promoção: ");
        System.out.println(empresa.getFuncionario(1).promover().getNome());
        System.out.println(empresa.getFuncionario(1).promover().getCargo());
        System.out.println(empresa.getFuncionario(1).promover().getSalario());
    }
}
