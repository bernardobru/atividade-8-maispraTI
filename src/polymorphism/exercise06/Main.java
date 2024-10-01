package polymorphism.exercise06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        System.out.println("Polimorfismo com classes abstratas: \n");

        animais.forEach(Animal::emitirSom);
    }

}
