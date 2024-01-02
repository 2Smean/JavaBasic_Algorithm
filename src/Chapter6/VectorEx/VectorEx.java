package Chapter6.VectorEx;

import java.util.Vector;

public class VectorEx {

    public static int makeSum(Vector<Integer> v) {
        int sum = 0;
        for(int i=0; i<v.size(); i++) { //합을 구하는
            sum += v.get(i);
        }

        return sum;
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(100);
        v.add(5); // 자동 박싱. 5 -> Integer.valueOf(5)
        v.add(Integer.valueOf(4)); //Vector 에는 객체만 집어넣어야한다
        v.add(-1);

        v.add(2, 100);

        System.out.println(" 들어가 있는 개수 " + v.size());
        System.out.println(" 용량은 " + v.capacity());

        for(int i=0; i<v.size(); i++){
            //Integer n = v.get(i); // 1단계
            //int m = n.intValue(); // 1단계
            //int m = v.get(i); //자동 언박싱. v.get(i) -> v.get(i).intValue() // 2단계
            //System.out.print( m + " "); // 2단계
            System.out.print(v.get(i) + " "); // 3단계
        }
        System.out.println();

        System.out.println("합은" + makeSum(v));
    }
}
