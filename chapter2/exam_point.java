package chapter2;

import java.util.Scanner;

public class exam_point {
    public static void main(String[] args){
        int a = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (90 <= a && a <= 100)
            System.out.print("A");
        else if (80 <= a && a <= 89)
            System.out.print("B");
        else if (70 <= a && a <= 79)
            System.out.print("C");
        else if (60 <= a && a <= 69)
            System.out.print("D");
        else if (a <= 59)
            System.out.print("F");
        else
            System.out.print("0이상 100이하의 숫자를 입력하시오.");
    }
}
