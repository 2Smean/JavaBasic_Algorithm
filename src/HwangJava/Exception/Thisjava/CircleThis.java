package HwangJava.Exception.Thisjava;

class Circle3 {
    private int radius; // Myclass 라는 메인에서 class 를 실행하는데
    //MyClass 안에서는 다른 클래스안에 있는 private 한 멤버를 볼수 없다
//    public int radius; // 원의 반지름 필드 //public 으로 하면 문제가 생기지 않는다
    private String name; // 원의 이름 필드
//    public String name; // 원의 이름 필드

    public Circle3() { // 원의 생성자
        System.out.println("생성자");
    }
    public Circle3(int radius, String name) { // 멤버 변수와 매개 변수가 같을 경우에 this를 사용하여 분리해준다
        this.radius = radius;//매개변수 : radius , 멤버변수 : this.radius // 컴퓨터 언어의 범위 규칙에 의해서 변수가 어떤 타입의 변수인지 모르겠다 했을때는 찾아야한다 컴파일러가
        this.name = name;
        System.out.println("생성자2");
    }
    public double getArea() {
        return 3.14*radius*radius;
    }

}

public class CircleThis {
    public static void main(String[] args) {
        Circle2 pizza; // Circle 객체를 가리킬 레퍼런스 변수
        pizza = new Circle2(10, "자바피자'"); // 멤버 변수들(radius, name, 생성자 getArea)이 객체 내에 생긴다 그리고 pizza 가 거길 가르킨다
//        pizza.radius = 10; // 멤버 변수에 값을 준다
//        pizza.name = "자바피자"; // 멤버 변수에 값주기
        double area  = pizza.getArea(); // 피자의 면적이 궁금한데 Circle 의 반지름 객체인 getArea 에서 값을 받아서 duble area에 대입한다
        System.out.println("피자의 면적은" + area);

        Circle2 donut; // 레퍼런스 변수
        donut = new Circle2(2, "자바도넛"); // Circle 이라는 이름의 함수 실행. 생성자 실행
//        donut.radius = 2;
//        donut.name ="자바도넛";
        area = donut.getArea(); // 이미 area 는 만들어져 있다 main 아니면 지역 변수이다
        System.out.println("도넛의 면적은" + area);


    }
}