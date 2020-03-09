package ex1;

public class Tabl {
    public static void main(String[] args) {


        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 6; j++) {
               System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
             System.out.println();
        }
        System.out.println();
        for (int i = 1; i < 11; i++) {
            for (int j = 6; j < 11; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i*j);
            }
            System.out.println();
        }


    }
      
}

