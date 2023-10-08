package Chapter5;

class Shape{
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw(){ //오버라이딩
        System.out.println("Line");
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
        p.draw(); // 전달된 객체의 draw 메서드를 호출하여 그림을 그립니다.
    }
    public static void main(String args[]) {
        Line line = new Line();
        Shape shape = line; // 업캐스팅

        line.draw();//Line 클래스의 draw() 호출
        shape.draw(); //Shape 클래스의 draw() 호출 -> 동적 바인딩에 의해 Line 클래스의 draw() 실행

        print(shape); // Shape 객체 전달, Shape 클래스의 draw() 호출
        print(new Circle()); // Circle 객체 전달, Circle 클래스의 draw() 호출
        print(new Rect()); // Rect 객체 전달, Rect 클래스의 draw() 호출
    }
}
