package JAVA초급;

public class NewTubeSystem {
    public static void main(String[] args) {
        User steve = new User();

        steve.email = "steve@codepresso.kr";
        steve.password = "asd123";
        steve.nickname = "steve";
        steve.age = 22;

                System.out.println("User Info" +
                                    "\nemail: " + steve.email +
                                    "\nnickname: " + steve.nickname +
                                    "\nage: " + steve.age);
    }
}
