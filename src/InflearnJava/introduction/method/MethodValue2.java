package InflearnJava.introduction.method;

public class MethodValue2 {
    public static void main(String[] args) { // 값을 복사해서 전달했기 때문에 이름이 같아도 값이 다르다
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); //5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); //5
    }

    public static void changeNumber(int number) { //changeNumber 의 number값이 변해도 main의 number 값에 영향을 주지 못한다
        System.out.println("2. changeNumber 변경 전, num2: " + number); //5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + number); //10
    }
}
