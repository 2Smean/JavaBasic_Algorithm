package InflearnJava.introduction.question;

import java.util.Scanner;

public class Intro_Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"영어", "국어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 :");
            for (int j = 0; j < subjects.length; j++) {
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < subjects.length; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
