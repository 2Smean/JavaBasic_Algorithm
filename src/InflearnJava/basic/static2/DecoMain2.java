package InflearnJava.basic.static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        //인스턴스 생성하지 않고 바로 사용가능
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
