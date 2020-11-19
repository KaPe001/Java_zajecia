package metody03;

public class Person {
    private String name = "Kasia";
    private String surname = "Blala";
    private int age = 20;
    private char gender = 'F';

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }
    public void increaseAge() {
        this.age++;
    }
}
