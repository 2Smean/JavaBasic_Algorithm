package HwangJava.Example;

import java.util.Scanner;

/*실습문제 9번*/
public class InCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원의 중심을 입력하세요 (x, y)");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("원의 반지름을 실수값으로 입력하세요");
        double radius = sc.nextDouble();
        System.out.println("임의의 점을 실수값으로 입력하세요 (x, y)");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double subtractX = x - x1;
        double absValueX = Math.abs(subtractX);

        double subtractY = y - y1;
        double absValueY = Math.abs(subtractY);

        //절대값으로 값을 받으려면 Math.abs 를 사용하면 된다
        if (absValueX < radius) {
            if (absValueY < radius) {
                System.out.println("점 " + "(" + x1 + "," + y1 + ")는 " + "원 안에 있다.");
            } else {
                System.out.println("점 " + "(" + x1 + "," + y1 + ")는 " + "원 안에 존재하지 않습니다.");
            }
        } else {
            System.out.println("점 " + "(" + x1 + "," + y1 + ")는 " + "원 안에 존재하지 않습니다.");
        }
    }
}
