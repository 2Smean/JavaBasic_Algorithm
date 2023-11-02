package Chapter6;

 class Point {
     private int x, y;
     public Point(int x, int y) {
         this.x = x;
         this.y = y;
     }

     public String toString() {
         return "(" + x + "," + y + ")";
     }

    public boolean equals(Object obj) {
         Point p = (Point)obj; // 다운 캐스팅
         if(x == p.x && y == p.y) return true;
         return false; 
    }
 }

public class ObjectEx {
     public static void print(Object obj) {
         Class c = obj.getClass();
         String name = c.getName();
         System.out.println(name);
         System.out.println(obj.hashCode());
         System.out.println(obj.toString());
     }

    public static void main(String[] args) {
        //Object p = new Point(2,3);
        Point p = new Point(2,3);
        //print(p);
        //System.out.println(p); // p -> p.toString()
        Point a = new Point(2,3);
        Point b = new Point(2,3);
        Point c = a;

        if(a == b) System.out.println("a==b");
        if(a == c) System.out.println("a==c");

        if(a.equals(b)) System.out.println("a equals b");
    }
}
