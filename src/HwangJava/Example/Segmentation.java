package HwangJava.Example;
/*실습문제 3*/
import java.util.Scanner;

public class Segmentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("금액을 입력하시오>>");
        int money = sc.nextInt();
        int fiveManWon = 0, manWon = 0, chWon = 0, bekWon = 0, oSipWon = 0, sipWon = 0, illWon = 0;

        if (money >= 50000) {
            fiveManWon = money / 50000;
            System.out.println("오만원권 " + fiveManWon + "매");
            money = money % 50000;
        }

        if (money >= 10000) {
            manWon = money / 10000;
            System.out.println("만원권 " + manWon + "매");
            money = money % 10000;
        }

        if (money >= 1000) {
            chWon = money / 1000;
            System.out.println("천원 " + chWon + "매");
            money = money % 1000;
        }

        if (money >= 100) {
            bekWon = money / 100;
            System.out.println("백원 " + bekWon + "개");
            money = money % 100;
        }

        if (money >= 10) {
            sipWon = money / 10;
            System.out.println("십원 " + sipWon + "개");
            money = money % 10;
        }

        if (money >= 1) {
            illWon = money;
            System.out.println("일원 " + illWon + "개");;
        }
    }
}
