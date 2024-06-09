package InflearnJava.introduction.array;

public class Array1 {
    public static void main(String[] args) {
        int[] ArrayList = {90, 80, 70, 60, 50};

        for (int i = 0; i < ArrayList.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수는 " + ArrayList[i]);
        }
    }
}
