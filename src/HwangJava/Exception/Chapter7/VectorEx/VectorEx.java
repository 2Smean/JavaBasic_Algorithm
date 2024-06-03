package HwangJava.Exception.Chapter7.VectorEx;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
    public static int makeSum(Vector<Integer> v) { // Vector의 래퍼런스만 넘어왔다
        //합을 구해보자
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum += v.get(i);
        }
        return sum;
    }
    public static void print(Vector<Integer> v) {
//        for (int i = 0; i < v.size(); i++) {
////            Integer n = v.get(i);
////            int m = n.intValue();
////            int m = v.get(i); // 자동 언박싱. v.get(i) -> v.get(i).intValue() 이렇게 바뀐것임
////            System.out.print(m + " ");
//            System.out.print(v.get(i) + " ");
//        }
//        System.out.println();

        // Iterator를 이용하여 출력
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(20); // Vector 는 ArrayList 와 거의 유사하다. ()를 사용하는 이유는 생성자 이기 때문이다
        v.add(5); // 자동 박싱. 5 -> Integer.valueOf(5)
        v.add(Integer.valueOf(4)); // 원래는 이렇게 boxing 을 해줘야하는데 위처럼 컴파일러가 AutoBoxing 처리를 해준다
        v.add(-1);

        v.add(2, 100);
        System.out.println("현재 들어가 있는 개수는" + v.size()); // size 로 구한다
        System.out.println("용량은" + v.capacity()); // 용량과 size 는 다르다. 용량이 10 이 나왔는데 default 값 10

        print(v);

        // Vector 는 값이 초과될 때 두배씩 늘려서 새로 Vector 를 할당받고 이전값을 복사하여 담는데 이는 값이 커질 수록
        // 시간 복잡도가 증가하게 된다. 그래서 값을 대략 알고 있을때에는 직접 할당 후 코딩을 하는 것이 효율적이다

        System.out.println("합은" + makeSum(v));
    }
}
