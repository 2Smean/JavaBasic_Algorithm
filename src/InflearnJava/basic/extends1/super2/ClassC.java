package InflearnJava.basic.extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10,20); //B에서 생성자를 직접 정의해버렸기 때문에
        System.out.println("ClassC 생성자");
    }
}
