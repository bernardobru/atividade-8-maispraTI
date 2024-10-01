package polymorphism.exercise05;

public class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O ciclista está pedalando");
    }

    @Override
    public void frear() {
        System.out.println("O ciclista está freando");
    }
}
