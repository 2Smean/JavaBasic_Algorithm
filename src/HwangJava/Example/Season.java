package HwangJava.Example;

import java.util.Scanner;

/*실습문제 11*/
public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("달을 입력하세요(1~12)>>");
        int month = sc.nextInt();


        //switch 문 예제
//        switch (month) {
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("봄");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("여름");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("가을");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("겨울");
//                break;
//        }

        if (month >= 3 && month <= 5) {
            System.out.println("봄");
        } else if (month >= 6 && month <= 8) {
            System.out.println("여름");
        } else if (month >= 9 && month <= 11) {
            System.out.println("가을");
        }else{
            System.out.println("겨울");
        }
    }
}
