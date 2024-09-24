package polymorphism.exercise05;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        Bicicleta bicicleta = new Bicicleta();

        Trem trem = new Trem();

        MeioTransporte[] meios = new MeioTransporte[3];

        meios[0] = carro;
        meios[1] = bicicleta;
        meios[2] = trem;

        for (MeioTransporte meio : meios) {
            meio.acelerar();
            meio.frear();
            System.out.println();
        }
    }
}
