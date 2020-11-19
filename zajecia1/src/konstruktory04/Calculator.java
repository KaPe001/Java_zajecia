package konstruktory04;

public class Calculator {
    //public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        public void add() {
            result = num1 + num2;
            System.out.println("Added " + num1 + "to " + num2 + "got " + result);
        }
        public void multiply() {
            result = num1 * num2;
            System.out.println("Multiplied " + num1 + "with " + num2 + "got " + result);
        }
        public void subtrack() {
            result = num1 - num2;
            System.out.println("Subtracted " + num1 + "from " + num2 + "got " + result);
        }
        public void divide() {
            result = num1 / num2;
            System.out.println("Divided " + num1 + "by " + num2 + "got " + result);
        }


}

