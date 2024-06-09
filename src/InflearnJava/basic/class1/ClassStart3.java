package InflearnJava.basic.class1;

public class ClassStart3 {
    public static void main(String[] args) { //객체를 생성하여 변수에 담는 것 기존의 변수선언과 비슷하다
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 70;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        System.out.println(student1);//참조값 @ 뒤의값이 참조값
        System.out.println(student2);//참조값

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
