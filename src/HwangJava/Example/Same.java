package HwangJava.Example;
/*실습문제 2*/
import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("2자리수 정수 입력(10~99) >>");
        int i = sc.nextInt();

        int firstNum = i / 10;
        int secondNum = i % 10;

        System.out.println((firstNum == secondNum)?"Yes! 10의 자리와 1의 자리가 같습니다":"같지않습니다");
    }
}
