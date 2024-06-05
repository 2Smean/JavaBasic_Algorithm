package HwangJava.Example;

import java.util.Scanner;

public class RectangularCoordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점 (x,y)의 좌표를 입력하시오>>");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x >= 100 && x <= 200) {
            if (y >= 100 && y <= 200) {
                System.out.println("(" + x + "," + y + ")는 " + "사각형 안에 있습니다.");
            } else {
                System.out.println("입력하신 좌표는 사각형 내에 존재하지 않습니다.");
            }
        }
    }
}
