package atrybuty02;

public class Person {
    //private String name;
    public String name;
    public String surname = "Kowalska";
    public int age = 18;
    public char gender = 'F';

//    public String toString(){
//        return "Imię:" + name + ", Nazwisko:" + surname + ", wiek:" + age + ", płeć:" + gender;

    public Person(String name){
        this.name = name;

    } //konstruktor

    public void increaseAge() { //zad.4
        this.age++;
        //this.age = this.age +1;
    }

    public String toString() {
        return "Wiek osoby " + surname + " to " + age;
    }
}