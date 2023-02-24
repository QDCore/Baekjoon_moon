package chapter2;

import java.util.Scanner;

public class yoon_year {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);

        int y = ac.nextInt();
        ac.close();

        if (y % 4 == 0){
            if (y % 400 == 0){
                System.out.println(1);
            }
            else if (y % 100 == 0) {
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }
        }
        else {
            System.out.println(0);
        }
        System.out.println((y % 4 == 0) ? ((y % 400 == 0) ? 1 : (y % 100 == 0) ? 0 : 1) : 0);
    }
}
