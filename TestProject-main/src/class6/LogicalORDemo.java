package class6;

import java.util.Scanner;

public class LogicalORDemo {
    public static void main(String[] args) {
        Scanner dayinput=new Scanner(System.in);
        System.out.println("Please enter the day:");
        String day= dayinput.nextLine();
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("There is no class");
        } else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
            System.out.println("There is Java class");
        } else if (day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")) {
            System.out.println("There is Testing class");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("There is Review class");
        }else {
            System.out.println("Invalid input");
        }
    }
}
