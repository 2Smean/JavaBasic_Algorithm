package InflearnJava.basic.construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 18;
        member1.grade = 70;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 19;
        member2.grade = 80;

        MemberInit[] memberInits = {member1, member2};

        for (MemberInit s : memberInits) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
