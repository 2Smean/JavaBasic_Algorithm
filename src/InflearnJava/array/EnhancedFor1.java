package InflearnJava.array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for 문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for 문
        for (int number : numbers) { // 단축키 iter 이고, 배열 전체를 전부 돈다.
            System.out.println(number);
        }
    }
}
