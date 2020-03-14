package ex2;

import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        //System.out.println("test");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" вВЕДИТЕ ДАННЫЕ");
        int i;
        while (true) {
            if(scanner.hasNextInt()){
                 i = scanner.nextInt();
                break;
            }
            else{
               String temp =  scanner.nextLine();
            }
        }
        System.out.println("Echo: " + i);
    }
}
