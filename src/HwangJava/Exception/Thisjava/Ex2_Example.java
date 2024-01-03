package HwangJava.Exception.Thisjava;

import java.util.Scanner;

public class Ex2_Example {
    public static void main(String[] args) {
        System.out.println("두개의 정수를 입력받아 합을 구하세요");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println("정수의 합은"+(n+m)+"입니다");
    }
}
