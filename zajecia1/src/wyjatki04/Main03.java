package wyjatki04;

public class Main03 {

        public static void main(String[] args) {

            try{
                showLength(null);
                String s = null;
                System.out.println(s);
            }catch (NullPointerException e){
                System.out.println("S jest niezdefiniowany");
            }
        }

        static void showLength(String s) {
            System.out.println(s.length());
        }
}
