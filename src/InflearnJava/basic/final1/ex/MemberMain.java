package InflearnJava.basic.final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        //id 는 변경되지 않는데 이는 final 을 사용하였기 때문이다 ( 제약 )
        member.changeData("myId2", "seo");
        member.print();
    }
}
