package HwangJava.Example;

import java.util.Scanner;

/*교과서 예제 2-14 Switch 문으로 학점 매기기*/
public class GradingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade;
        System.out.println("점수를 입력하세요(0~100): ");
        int score = sc.nextInt();
        switch (score / 10) {
            case 10 :
            case 9:
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("학점은 " + grade + " 입니다");
    }
}
