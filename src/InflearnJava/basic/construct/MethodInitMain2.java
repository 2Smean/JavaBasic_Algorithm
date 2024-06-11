package InflearnJava.basic.construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 20, 80);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 19, 70);

        MemberInit[] memberInits = {member1, member2};

        for (MemberInit s : memberInits) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = "user1";
        member.age = 18;
        member.grade = 70;
    }
}
