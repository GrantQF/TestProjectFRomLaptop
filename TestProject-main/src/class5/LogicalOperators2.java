package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        double mathScore = 92.5;
        double historyScore = 61.5;
        double scienceScore = 93.5;
/*
        if (mathScore > 90 && historyScore > 90 && scienceScore > 90) {
            System.out.println("You are a brilliant student");
        } else {
            System.out.println("you need to work hard");
        }

 */
        if (mathScore > 90 || historyScore > 80) {
            System.out.println("You are smart");
        } else {
            System.out.println("you are dumb");
        }
    }
}