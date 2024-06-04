package HwangJava.Example;
/*교과서 예제 2-13 중첩 If-else 문 사례*/
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요(0~100): ");
        int score = sc.nextInt();
        System.out.println("학년을 입력하세요(1~4): ");
        int year = sc.nextInt();

        if (score >= 60) {
            if (year != 4) {
                System.out.println("합격입니다");
            } else if (score >= 70) {
                System.out.println("합격입니다");
            } else {
                System.out.println("불합격입니다");
            }
        }else {
            System.out.println("불합격!");
        }
    }
}
