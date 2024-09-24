package polymorphism.exercise05;

public class Carro implements MeioTransporte{
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando a 70km/h");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando");
    }
}
