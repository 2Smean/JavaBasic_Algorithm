package thisjava.examples.switch_ex;

public class SwitchValueExample {

    public static void main(String[] args) {
        String grade = "B";

        beforeSwitch(grade);

        afterSwitch(grade);
    }

    private static int beforeSwitch(String grade) {
        //Java 11 이전 문법
        int score1 = 0;
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1: " + score1);
        return score1;
    }

    private static int afterSwitch(String grade) {
        //Java 12부터 가능
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                //Java 13 부터 가능
                yield result;
            }
            default -> 60;
        };
        System.out.println("score2: " + score2);
        return score2;
    }
}
