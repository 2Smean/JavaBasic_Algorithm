package InflearnJava.basic.poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child child) { // true 시에 child 변수 사용 가능 ( Java 16 이상 부터 가능 )
            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent; // true 면 사실상 다운캐스팅을 사용할 것이기에 로직 최적화 가능
            child.childMethod();
        }
    }
}
