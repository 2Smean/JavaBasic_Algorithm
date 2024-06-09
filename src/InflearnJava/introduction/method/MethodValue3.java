package InflearnJava.introduction.method;
// 변수명 전체 한번에 바꾸는 mac 명령어 : shift + fn + f6
public class MethodValue3 {
    public static void main(String[] args) { // 값을 복사해서 전달했기 때문에 이름이 같아도 값이 다르다
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1); // 결과를 받게 되면 값이 변경된다
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
