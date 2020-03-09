package ex1;

public class BMI {
    public static void main(String[] args) {
        double bmi = BMI(90, 180);
        System.out.println(bmi);
        //Второй способ.
         BMI1(122, 196);
    }

    static double BMI(double m, double height) {
        return  (int)((m / (height * height))*10000);
    }
//Второй способ.
    static void BMI1(double m, double height) {
        double result = (int)((m / (height * height))*10000);
        System.out.println(result);
    }

    public static class Tabl2 {
        public static void main(String[] args) {
            multLine(2, 10);
        }

        public static void multLine(int from, int to) {
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
}
