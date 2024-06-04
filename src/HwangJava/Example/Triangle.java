package HwangJava.Example;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 3개를 입력하시오>>");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A + C) > B) {
            if ((A + B) > C) {
                System.out.println("삼각형이 됩니다");
            } else {
                System.out.println("삼각형이 안됩니다");
            }
        }
    }
}
