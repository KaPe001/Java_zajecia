package konstruktory04;

public class Burger {
    //    constructor with arguments

//    String size = "M";
//    double price = 19.99;
//
//    public Burger() {
//        size = "M";
//        double price = 19.99;
//    }
//
//    public static void main(String[] args) {
//        Burger burger = new Burger();
//        System.out.println(burger.size + " " + burger.price);
//    }

    //contructor wo arguments

    String size;
    double price;

    public static void main (String[] args){
    Burger burger1 = new Burger();
        System.out.println(burger1.size);
        System.out.println(burger1.price);
    }
}
