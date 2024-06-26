package InflearnJava.basic.access.b;

import InflearnJava.basic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지 default 호출 불가 // cannot be accessed from outside package
//        data.defaultField = 2;
//        data.defaultMethod();

        //private 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess(); // innerAccess는 내부호출이다. 내부호출에서 private은 가능하기 때문에 호출된다
    }
}
