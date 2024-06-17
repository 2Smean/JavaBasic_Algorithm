package InflearnJava.basic.static2;

//import static InflearnJava.basic.static2.DecoData.staticCall; //메서드 지정

//import static InflearnJava.basic.static2.DecoData.*; // 클래스 내부의 모든 메서드 사용

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출 ");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2 ");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1); // 외부에서 참조값을 직접 값을 넘겨줘서 사용하는 것은 static과 상관없다.

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        DecoData.staticCall(); //인스턴스 메서드를 호출하는 것처럼 헷갈리기에 사용하지 않는 것이 좋다

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
