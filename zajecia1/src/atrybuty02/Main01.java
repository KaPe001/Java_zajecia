package atrybuty02;

public class Main01 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.protectedAttribute = "protected";
        testAttribute.publicAttribute = "publiczny";

        System.out.println(testAttribute.protectedAttribute);
        System.out.println(testAttribute.publicAttribute);
    }
}
