package HwangJava.Exception.Chapter7.VectorEx;

import java.util.Vector;

class Point { // Point 를 만들어서 실행하는데 Integer 나 String 처럼 여러가지를 넣어서 사용할 수 있다
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<Point>();
        v.add(new Point(1, 2));
        v.add(new Point(3, 5));
        v.add(new Point(-5, 50));

        v.remove(1);

        for (int i = 0; i < v.size(); i++) {
            Point p = v.get(i);
            System.out.println(p); // 자동으로 p.toString()으로 바뀌어서 실행이 된다
        }
    }
}
