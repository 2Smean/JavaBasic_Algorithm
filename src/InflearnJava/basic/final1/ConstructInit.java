package InflearnJava.basic.final1;

public class ConstructInit {
    final int value;

    public ConstructInit(int value) { //final을 필드에 사용하면 생성자를 통해서 초기화가능
        this.value = value;
    }
}
