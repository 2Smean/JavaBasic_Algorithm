package InflearnJava.basic.class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 70;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        Student[] students = {student1,student2};
        //방법1
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }
        //방법2
        for (int i = 0; i < students.length; i++) {
            Student s = students[i]; // 선언해두고 담아두고 사용
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
        //방법3
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

    }
}
