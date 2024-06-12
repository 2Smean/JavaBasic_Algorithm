package InflearnJava.basic.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess(); // innerAccess는 내부호출이다. 내부호출에서 private은 가능하기 때문에 호출된다
    }
}
