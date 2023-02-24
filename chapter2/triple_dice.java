package chapter2;

import java.util.Scanner;

public class triple_dice {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);

        int one = ac.nextInt();
        int two = ac.nextInt();
        int tre = ac.nextInt();

        ac.close();

        if (one == two && one == tre){
            System.out.println(10000 + (one * 1000));
        }
        //3개의 주사위가 전부 다를 경우
        else if (one != two && one != tre && two != tre) {
            int max;
            if (one > two){
                if (one > tre){
                    max = one;
                }
                else {
                    max = tre;
                }
            }
            else {
                if (two > tre){
                    max = two;
                }
                else {
                    max = tre;
                }
            }
            System.out.println(100 * max);
        }
        else {
            if(one == two || one == tre){
                System.out.println(1000 + (one * 100));
            }
            else {
                System.out.println(1000 + (two * 100));
            }
        }

    }
}
