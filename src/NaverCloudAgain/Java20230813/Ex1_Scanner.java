package NaverCloudAgain.Java20230813;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("나이를 입력하세요");
            int name = sc.nextInt();
            System.out.println("당신의 나이는" + name + "세 입니다.");
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해주세요");
            
        }





    }
}
