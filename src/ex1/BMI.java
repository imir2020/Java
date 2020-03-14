package ex1;
// Вычисление индекса массы тела
import java.util.Scanner;

public class BMI {
    public static void main( String[] args ) {
        // bmi( 84, 195 );
        //Первый способ вычисления индекса массы.
        Scanner sc = new Scanner( System.in );
        System.out.println( "Ввод данных:" );
        System.out.println( "Введите вес:" );
        double weight = sc.nextDouble( );
        System.out.println( "Введите рост:" );
        double height = sc.nextDouble( );
            double i = ( weight / ( height * height ) ) * 10000;
            if (i < 18.5) {
                System.out.println( "Недостаточная масса тела!" );
            }
            if (i > 18.5 && i < 25) {
                System.out.println( "Ваш вес в норме." );
            }
            if (i > 25 && i < 35) {
                System.out.println( "Ожирение!" );
            }
            if (i > 35) {
                System.out.println( "Резкое ожирение!!!" );
            }
        }

    // Второй способ вычисления индекса массы.
    //static void bmi( double weight, double height ) {
        //double i = ( weight / ( height * height ) ) * 10000;
        //if (i < 18.5) {
          //  System.out.println( "Недостаточная масса тела!" );
        //}
       // if (i > 18.5 && i < 25) {
          //  System.out.println( "Ваш вес в норме." );
       // }
       // if (i > 25 && i < 35) {
            //System.out.println( "Ожирение!" );
        //}
        //if (i > 35) {
            //System.out.println( "Резкое ожирение!!!" );
        //}
    }

