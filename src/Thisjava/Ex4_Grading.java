//score가 90점 이상, 80이상 90미만 , 70이상 80미만, 60이상 70미만 60미만 
package Thisjava ;
import java.util.Scanner;
public class Ex4_Grading {
    public static void main(String[] args) {
        char grade;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("점수를 입력하세요");
        int score=sc.nextInt();
        if(score>=90)

            grade='A';
        else if (score>=80)
            grade='B';
        else if (score>=70)
            grade='C';
        else if (score>=60)
            grade='D';
        else
            grade='f';

    //조건문의 대괄호"{}"는 조건이 하나 일때는 감싸지 않는다
        System.out.println("학점은"+grade+"입니다");

    }
}
