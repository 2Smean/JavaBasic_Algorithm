package InflearnJava.basic.poly.ex3;

public abstract class AbstractAnimal {

    //오버라이딩 목적
    public abstract void sound();

    //상속하여 사용 목적
    public void move() {
        System.out.println("동물이 움직입니다");
    }

}
