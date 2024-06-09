package InflearnJava.introduction.method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) { //메서드는 값에 맞다면 바로 빠져나간다
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; //반환타입 상관없이 return 을 만나면 메서드가 끝나버린다
        }

        System.out.println(age + "살, 입장하세요");
    }
}
