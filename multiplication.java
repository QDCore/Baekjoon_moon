import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();

        in.close();

        System.out.println(first * (second % 10));
        System.out.println(first * ((second % 100) / 10));
        System.out.println(first * (second / 100));
        System.out.println(first * second);
    }
}
