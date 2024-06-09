package InflearnJava;

import java.util.Scanner;

public class Intro_Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 정수의 개수를 입력하세요 : ");
        int option = sc.nextInt();

        int[] numbers = new int[option];

        int max, min;

        System.out.println(option + "개의 정수를 입력하세요 : ");


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        max = numbers[0];
        min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("가장 작은 정수 :" + min);
        System.out.println("가장 큰 정수 :" + max);
    }
}
