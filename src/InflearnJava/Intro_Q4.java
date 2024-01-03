package InflearnJava;
/*num1, num2, num3, int 변수 선언하고 각각 10 20 30 으로 초기화

세변수의 합을 계산하고, 그 결과를 sum이라는 이름의 int 변수에 저장

세 변수의 평균을 계산하고, 그 결과를 average 라는 이름의 int 변수에 저장하세요. 평균 계산시 소수점 이하의 결과는 버림하세요

sum과 average 변수의 값을 출력하세요*/
//평균 계산법 : 평균은 자료값을 모두 더해 자료의 수로 나눈 값을 말한다
public class Intro_Q4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;

        int average = sum / 3;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }


}
