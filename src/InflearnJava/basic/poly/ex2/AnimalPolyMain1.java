package InflearnJava.basic.poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) { // 타입을 Animal 로 정한 후 overriding 을 통해 해결
        System.out.println("동물 울음 소리 시작");
        animal.sound();
        System.out.println("동물 울음 소리 종료");
    }
}
