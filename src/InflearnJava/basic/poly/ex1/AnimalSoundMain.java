package InflearnJava.basic.poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        //배열을 통한 중복 제거 시도
//        Caw[] caws = {caw, cat, dog}; //타입이 다르기에 컴파일 오류 발생!



        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        soundCat(cat);
//        soundCat(caw); 타입이 다르고 동물이 추가되면 메서드를 계속 추가해줘야 한다는 단점이 있다

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");

    }

    private static void soundCat(Cat cat) {
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
