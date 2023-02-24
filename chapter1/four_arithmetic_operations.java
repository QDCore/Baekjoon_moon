package chapter1;

import java.util.Scanner;

public class four_arithmetic_operations {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);

        int a = ac.nextInt();
        int b = ac.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
