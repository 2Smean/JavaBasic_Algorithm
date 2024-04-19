package HwangJava.Exception.Chapter2;

import java.util.Scanner;
public class MyArrayEx {
    public static void pr(int[] a) {
        /*for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }*/

        for (int k : a) {
            System.out.print(k + " "); // k = a[i]의 읽어온값
        }
    }

    public static int big(int[] a) {
        int max = a[0];
//        for(int i=0;i<a.length;i++){
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
        for (int k : a) {
            if (k > max) {//k 는 a[i]를 읽어온값
                max = k;
            }
        }
        return max;
    }

    public static void read(int[] a) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열에 값을 입력하세요");

        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        int[] intArr = new int[5]; // intArr 은 배열에 대한 레퍼런스 변수다. sout 을 통해 값을 찍어보면 [I@72ea2f77 이러한 hash값이 나온다

        read(intArr);
        pr(intArr);
        int max = big(intArr);

        System.out.println();

        System.out.println("배열에서 가장 큰 값은" + max);
    }
}
