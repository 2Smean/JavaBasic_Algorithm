package HwangJava.Example;
/*교과서 예제 2-8 삼항연산자 기본*/
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5;

        System.out.println("두 수의 차는 " + ((a > b) ? (a - b) : (b - a)));
    }
}
