package HwangJava.Exception.Chapter5;

class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class UpCasting {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person p;
        Student s = new Student("이승민");
        p = s;

        System.out.println(p.name);
    }

}
