package InflearnJava.introduction.problem_and_solution;
/*double 변수들을 선언하고 그합과 평균을 출력하는 프로그램

double val1 = 1.5;

double val2 = 2.5;

double val3 = 3.5;*/
public class Intro_Q5 {
    public static void main(String[] args) {
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1 + val2 + val3;

        double avg = sum / 3;

        System.out.println("result = " + sum);
        System.out.println("average = " + avg);
    }
}
