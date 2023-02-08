package chapter1;

import java.util.Scanner;

public class chess {
    public static void main(String[] args){
        int K, Q, R, B, Kn, P;
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        Q = sc.nextInt();
        R = sc.nextInt();
        B = sc.nextInt();
        Kn = sc.nextInt();
        P = sc.nextInt();

        System.out.println((1 - K) + " " + (1 - Q) + " " + (2 - R) + " " + (2 - B) + " " + (2 - Kn) + " " + (8 - P));
    }
}
