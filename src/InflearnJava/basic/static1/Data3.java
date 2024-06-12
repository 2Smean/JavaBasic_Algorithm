package InflearnJava.basic.static1;

public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++; // 내 클래스 안에서는 Data3.count 생략 가능
    }
}
