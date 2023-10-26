package Chapter5;
import java.util.Properties;
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
        Student s = new Student("이승민123123");
        p = s;

        System.out.println(p.name);
    }

}
