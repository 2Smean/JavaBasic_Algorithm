package InflearnJava.basic.static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스의 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) { // 소수점이 나올 수 있기 때문에 double 로 캐스팅
        return (double) sum(values) / values.length; // 이미 합을 구하는 메서드를 만들었기 때문에 사용할 수 있다.
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
