package polymorphism.exercise05;

public class Bicicleta implements MeioTransporte{
    @Override
    public void acelerar() {
        System.out.println("O ciclista está pedalando");
    }

    @Override
    public void frear() {
        System.out.println("O ciclista está freando");
    }
}
