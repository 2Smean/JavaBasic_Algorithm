package HwangJava.Exception.Chapter2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신여부 입력");

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String city = sc.next();
        int age = sc.nextInt();
        double weight = sc.nextDouble();
        boolean isSingle = sc.nextBoolean();

        System.out.print(name +"님이 사는 곳은 " + city + "이고 나이는 " + age + "," +
                " 체중은 " + weight + " 독신여부는 " + isSingle + "입니다.");
    }
}
