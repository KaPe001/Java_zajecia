package konstruktory04;

import org.w3c.dom.ls.LSOutput;

public class Person {
    private String name = "Ala";
    private String surname = "Kowal";
    private int age = 30;
    private char gender = 'F';

    Person person = new Person(name, surname);
    Person(String name, String surname){
        System.out.println(person);
    }
    Person person1 = new Person(name, age);
    Person(String name, int age){
        System.out.println(person1);
    }
    Person person2 = new Person(name, surname, age, gender);
    Person(String name, String surname, int age, char gender){
        System.out.println(person2);
    }




}
