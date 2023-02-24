package chapter2;

import java.util.Scanner;

public class oven {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);

        // a, b 에 각각 시간,분을 입력받고, c에 추가할 시간을 입력받는다.
        int a = ac.nextInt();
        int b = ac.nextInt();

        int c = ac.nextInt();

        //입력된 시간,분을 분단위로 환산
        int min = a * 60 + b;

        //입력된 시간에서 요리하는데 필요한 시간을 추가
        min += c;

        //시간은 분으로 환산한 값에 요리시간을 추가한 최종 값 나누기 60의 몫(몫이 24를 초과했을 시 0시로 되돌리기 위해 24로 나눈 나머지의 값을 추가)
        int hour = (min / 60)%24;
        //분은 최종값에 나누기 60의 나머지
        int minit = (min % 60);

        System.out.println(hour + " " + minit);
    }
}
