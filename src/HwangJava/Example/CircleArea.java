package HwangJava.Example;
/*교과서 예제2-2 변수, 리터럴, 상수 활용*/
public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14; //원주율을 상수로 선언

        double radius = 10.0; // 원의 반지름
        double circleArea = radius * radius * PI;

        // 원의 면적을 출력
        System.out.println("원의 면적은 " + circleArea + " 입니다.");
    }
}
