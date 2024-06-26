package InflearnJava.introduction.problem_and_solution;

public class Intro_Q31 {
    public static void main(String[] args) {
//        int student1 = 90;
//        int student2 = 80;
//        int student3 = 70;
//        int student4 = 60;
//        int student5 = 50;
//
//        int total = student1 + student2 + student3 + student4 + student5;
//        double average = (double) total / 5;
//
//        System.out.println("점수 총합: " + total);
//        System.out.println("점수 평균: " + average);

        // 개선

        int[] students = {90, 80, 70, 60, 50};

        int total = 0;

        for (int student : students) {
            total += student;
        }
        double average = (double) total / students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
