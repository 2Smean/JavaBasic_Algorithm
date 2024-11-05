package thisjava.examples.if_ex;

public class IfNestedExample {

    public static void main(String[] args) {
        int randomScore = (int) (Math.random() * 20) + 81;
        System.out.println("점수 : " + randomScore);

        String grade;

        if (randomScore >= 90) {
            if (randomScore >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (randomScore >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }

        System.out.println("학점: " + grade);
    }
}
