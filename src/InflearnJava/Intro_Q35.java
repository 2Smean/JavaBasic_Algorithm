package InflearnJava;

import java.util.Scanner;

public class Intro_Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요:");

        int count = sc.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.println("정수" + count + "개를 입력하세요");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average );
    }
}
