package HwangJava.Example;

import java.util.Scanner;

public class Clap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1~99 사이의 정수를 입력하시오>>");
        String num = sc.next();

        if (num.contains("3")) {
            if (num.contains("6")) {
                System.out.println("박수짝짝");
            } else if (num.contains("9")) {
                System.out.println("박수짝짝");
            } else if (num.contains("3")) {
                System.out.println("박수짝짝");
            }
        } else {
            System.out.println("박수짝");
        }
    }
}
