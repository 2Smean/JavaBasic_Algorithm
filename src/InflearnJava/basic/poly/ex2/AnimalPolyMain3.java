package InflearnJava.basic.poly.ex2;

public class AnimalPolyMain3 {
    //코드의 문제점 1. Animal 은 상속을 위한 코드이지만 객체를 생성할 수 있음
    //코드의 문제점 2. Animal 클래스를 상속받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성

    public static void main(String[] args) {

        Animal animalArr[] = {new Dog(), new Cat(), new Caw()};

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //동물이 추가 되어도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
