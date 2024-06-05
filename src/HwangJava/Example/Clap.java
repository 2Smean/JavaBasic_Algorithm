package HwangJava.Example;

import java.util.Scanner;

public class Clap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1~99 사이의 정수를 입력하시오>>");
        int numbers = sc.nextInt();

        int count = 0;
        int tens = numbers / 10;
        int ones = numbers % 10;

        if (tens == 3 || tens == 6 || tens == 9) {
            count++;
        }
        if (ones == 3 || ones == 6 || ones == 9) {
            count++;
        }

        if (count == 1) {
            System.out.println("박수짝");
        } else if (count == 2) {
            System.out.println("박수짝짝");
        } else {
            System.out.println("박수 없음");
        }
    }
}
