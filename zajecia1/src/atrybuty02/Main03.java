package atrybuty02;

public class Main03 {
    public static void main(String[] args) {
//        AccessModifier testAttribute = new AccessModifier();
//        testAttribute.protectedAttribute = "protected";
//        testAttribute.publicAttribute = "public";
//
//        System.out.println(testAttribute.protectedAttribute);
//        System.out.println(testAttribute.publicAttribute);

        Person person = new Person("Grażka");
        System.out.println(person);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.name);
        System.out.println(person.surname);

        person.increaseAge();
        System.out.println(person);
    }
}
