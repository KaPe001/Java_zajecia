package klasa01;

import java.net.SocketOption;

public class Main01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.miaucz();
        dog.szczekaj();

        if(cat.equals(dog)){
            System.out.println("są równe");
        } else
            System.out.println("nie są równe");


    }
}
