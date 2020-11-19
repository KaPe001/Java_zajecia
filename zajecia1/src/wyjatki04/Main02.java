package wyjatki04;

    public class Main02 {

        public static void main(String[] args) {
            int[] tab = {5, 1, 6, 7, 8};
//            try {
            getIndexFromArray(21, tab);
            //System.out.println(tab[21]);
//            } catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Wybrano niepoprawny index");
//            }

        }
        static void getIndexFromArray(int index, int[] tab) {
            if (index > tab.length) {
                throw new ArrayIndexOutOfBoundsException("Wybrany index jest większy niż 4");
            }else{
                System.out.println("Wybrano: " + tab[index]);
            }
        }
    }

