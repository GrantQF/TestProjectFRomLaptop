package homework6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the first person's name?");
        String name1= input.next();
        System.out.println("What is the second person's name?");
        String name2= input.next();
        System.out.println("Are you expecting a boy or girl?");
        String baby= input.next();
        if (baby.equalsIgnoreCase("girl")){
            String firsthalf=name2.substring(0,name2.length()/2);
            String secondhalf=name1.substring(name1.length()/2);
            System.out.println(firsthalf+secondhalf);

        }else if (baby.equalsIgnoreCase("boy")){
            String firsthalf=name1.substring(0,name1.length()/2);
            String secondhalf=name2.substring(name2.length()/2);
            System.out.println(firsthalf+secondhalf);
        }
    }
}
