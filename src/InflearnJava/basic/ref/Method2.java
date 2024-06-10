package InflearnJava.basic.ref;

public class Method2 {
    public static void main(String[] args) {

        Student student1 = createStudent("학생1", 17, 70);
        System.out.println("student1= " + student1);
        Student student2 = createStudent("학생2", 18, 90);
        System.out.println("student2= " + student2);

        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) { //name과 age, grade를 받아서
        Student student = new Student(); // 참조값을 만들고
        System.out.println("student= " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // 참조값을 반환
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
