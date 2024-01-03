package HwangJava.Exception.Thisjava;

import java.util.Scanner;

//점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.
public class Ex5_NestedIf {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score=sc.nextInt();
        System.out.println("학년을 입력하세요");
        int age=sc.nextInt();

        if(score>=60) {
            if (age != 4)
                System.out.println("합격입니다");
        }else if (score>=70){
            System.out.println("합격입니다");
        }else{
            System.out.println("불합격입니다");
        }{
            System.out.println("불합격입니다");
        }




    }
}
