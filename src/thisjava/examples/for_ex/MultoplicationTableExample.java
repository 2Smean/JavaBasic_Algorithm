package thisjava.examples.for_ex;

public class MultoplicationTableExample {

    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            System.out.println("*** " + i + " 단 ***");
            for (int j = 1; j <= 9; j++) {
                int sum = i * j;
                System.out.println(i + " * " + j + " = " + sum);
            }
        }
    }
}
