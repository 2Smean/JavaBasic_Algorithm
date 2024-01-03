package HwangJava.Exception.Chapter5;

abstract class Shape{ //추상 클래스 불완전함
    Shape next;

    public Shape(){
        next = null;
    }
    abstract public void draw(); //abstract : 추상메서드 추상적인 형태가 명확하지 않은
//    public void draw() { //아무 코드가 없다고 해도 괜찮다 없어도 상관없다
//        System.out.println("*****Shape*****");
//    }
}

class Line extends Shape {//추상클래스를 상속받으면 추상클래스가 된다
    public void draw(){ //추상 메소드를 반드시 오버라이딩 해야 한다.
        System.out.println("Line");
    }
    public void show() {
        System.out.print("~~~~~~~~");
    }
}

class Circle extends Shape {
    public void draw(){ //오버라이딩
        System.out.println("Circle");
    }
}

class Rect extends Shape {
    public void draw(){ //오버라이딩
        System.out.println("Rect");
    }
}

public class OverEx {
    public static void print(Shape p) { // p는 Shape 객체이거나 Shape을 상속받은 객체에 대한 레퍼런스
//        p.draw(); // 전달된 객체의 draw 메서드를 호출하여 그림을 그립니다.
        if (p instanceof Line){
//            System.out.println("Line 객체가 넘어왔다");
            Line l = (Line)p; //다운캐스팅
            l.show();
        }
        p.draw();
    }

    public static void paint(Shape p) {
        while (p != null) {
            p.draw(); // 동적 바인딩
            p = p.next;
        }
    }
    public static void main(String args[]) {
//        Line line = new Line();
//        Shape shape = line; // 업캐스팅
//
//        line.draw();//Line 클래스의 draw() 호출
//        shape.draw(); //Shape 클래스의 draw() 호출 -> 동적 바인딩에 의해 Line 클래스의 draw() 실행
//
//        print(shape); // Shape 객체 전달, Shape 클래스의 draw() 호출
//        print(new Circle()); // Circle 객체 전달, Circle 클래스의 draw() 호출
//        print(new Rect()); // Rect 객체 전달, Rect 클래스의 draw() 호출
        Shape start, last, obj;

        start = new Line(); // 업캐스팅//line이 추상 class 이므로 객체를 생성할 수 없다
        last = start;

        obj = new Rect();
        last.next = obj;
        last = obj;

        obj = new Circle();
        last.next = obj;
        last = obj;

        paint(start);
    }
}
