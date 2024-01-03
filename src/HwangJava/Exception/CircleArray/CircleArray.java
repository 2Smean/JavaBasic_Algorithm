package HwangJava.Exception.CircleArray;

import java.util.Scanner;

class Circle {
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자에게 Circle 의 반지름을 입력받겠다
        Circle[] c; // Circle 배열에 대한 레퍼런스 변수 c 선언
        c = new Circle [5]; // 레퍼런스 배열을 생성
        for (int i = 0; i < c.length; i++) {
            System.out.print((i+1) + ">>");
            int radius = sc.nextInt();
            c[i] = new Circle(radius); //0~4까지는 이상하니까 1을 더해서 1~5까지로 인덱스 값에 1을 더해줌
        }
        //생성 과정 끝

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i].getArea() + " ");
        }
    }

}
