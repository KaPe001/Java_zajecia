package wyjatki04;

public class Main05 {
    public static void main(String[] args) {
//not finished!!!
        try {
            int num = Integer.parseInt("xyz");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Wrong format");
        }
    }
}
