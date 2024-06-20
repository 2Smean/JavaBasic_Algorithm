package InflearnJava.basic.extends1.access.child;

import InflearnJava.basic.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계 O or 같은 패키지 X
        //defaultValue = 1; //다른 패키지에 접근 불가, 컴파일 오류
        //privateValue = 1; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속관계 O or 같은 패키지 X
        //defaultMethod(); //다른 패키지에 접근 불가, 컴파일 오류
        //privateMethod(); //접근 불가, 컴파일 오류

        printParent(); //자기 자신의 것이기에 호출 가능
    }
}
