package HwangJava.Example;
/*실습문제 8번*/
import java.util.Scanner;

public class InRectangular {
    public static boolean inRect(int x1, int y1, int x2, int y2) {
        if ((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200)) {
            if ((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점 (x1, y1), (x2, y2)를 입력하세요");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(inRect(x1, y1, x2, y2));
    }
}
