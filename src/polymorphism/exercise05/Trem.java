package polymorphism.exercise05;

public class Trem implements MeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O maquinista está saindo da estação");
    }

    @Override
    public void frear() {
        System.out.println("O maquinista está freando o trem");
    }
}
