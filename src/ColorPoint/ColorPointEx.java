package ColorPoint;

class Point{
    private int x, y;

    public Point(int x, int y){
        this.x = x; this.y = y;
    }

    public void show() {
        System.out.println("("+ x + "," + y + ")");
    }
}

class ColorPoint extends Point{
    private String color;

    public ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    public void show() { //오버라이딩
        super.show();
        System.out.print(color);
//      System.out.println(x);//private 이므로 오류발생


    }
}
public class ColorPointEx {

    public static void main(String[] args) {
        Point p = new Point(1,2);
//      p.set(1,2);// Point를 만들때 처음부터 1,2인 점을 만드는 것이 좋다
        p.show();

        p = new ColorPoint(1,2, "red"); //업캐스팅
        p.show();//점만 찍는 것임
    }

}