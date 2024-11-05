package thisjava.examples.while_ex;

import java.util.Scanner;

public class KeyControlExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("---------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("---------------------------");

            String strNum = sc.nextLine();

            if (strNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("2")) {
                if (speed != 0) {
                    speed--;
                    System.out.println("현재 속도 = " + speed);
                } else {
                    System.out.println("더이상 감소할 수 없습니다.");
                }

            } else if (strNum.equals("3")) {
                run = false;
                System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}
