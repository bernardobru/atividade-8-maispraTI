package polymorphism.exercise05;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        Bicicleta bicicleta = new Bicicleta();

        Trem trem = new Trem();

        IMeioTransporte[] meios = new IMeioTransporte[3];

        meios[0] = carro;
        meios[1] = bicicleta;
        meios[2] = trem;

        System.out.println("Polimorfismo com interfaces: \n");

        for (IMeioTransporte meio : meios) {
            meio.acelerar();
            meio.frear();
            System.out.println();
        }
    }
}
