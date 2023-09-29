package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_DivideByZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend;
        int divisor;

        while (true) {
            try {
                System.out.print("나뉨수를 입력하세요");
                dividend = sc.nextInt();
                System.out.print("나눗수를 입력하세요");
                divisor = sc.nextInt();
                System.out.println("나누면" + dividend / divisor);
                break;
            } catch (ArithmeticException e) {//ArithmeticException타입의 객체를 기다린다
                // e 는 객체이다 e 안에는 예외가 발생한 정보들이 다들어있다
//            e.printStackTrace();//이 코드가 오류를 받아내는 코드이다
                System.out.println("0으로 나누면 안됩니다. 다시 입력하세요");
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력하세요. 다시입력하세요");
                sc.nextLine(); // 현재 scanner의 버퍼에 있는 키 입력들을 읽어버린다

            }
        }
    }
}
