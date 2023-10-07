package ColorPoint;

class Point{
    private int x, y;

    public Point(int x, int y){
        this.x = x; this.y = y;
    }

    public void showPoint() {
        System.out.println("("+ x + "," + y + ")");
    }
}

class ColorPoint extends Point{
    private String color;

    public ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color);
//      System.out.println(x);//private 이므로 오류발생
        showPoint();

    }
}
public class ColorPointEx {

    public static void main(String[] args) {
        Point p = new Point(1,2);
//      p.set(1,2);// Point를 만들때 처음부터 1,2인 점을 만드는 것이 좋다
        p.showPoint();

        ColorPoint cp = new ColorPoint(1,2, "red");
        cp.showPoint();//점만 찍는 것임
        cp.showColorPoint();
    }

}