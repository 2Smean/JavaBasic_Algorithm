package HwangJava.Exception.Chapter2;

public class My2DArray {
    public static void print2d(int[][] m) {
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] makeArray() {
        int[][] m; //이차원 정수 배열을 가르키는 레퍼런스 배열 n선언
//      m = new int[3][5];
        m = new int[3][]; // 비정방형 배열

        m[0] = new int[3];
        m[1] = new int[7];
        m[2] = new int[10];

        return m;
    }
    public static void main(String[] args) {
        int[][] n;

        n = makeArray();

        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                n[i][j] = i * j;
            }
        }
    print2d(n);

    }
}
