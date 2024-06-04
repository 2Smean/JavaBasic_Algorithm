package HwangJava.Example;
/*실습문제 1*/
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원화를 입력하세요(단위 원) >>");
        int won = sc.nextInt();

        double conversionRate = 1100.0;
        double doller = won / conversionRate;

        System.out.println(won + "원은 " + "$"+ doller + "입니다.");
    }
}
