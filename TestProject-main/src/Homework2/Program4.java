package Homework2;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner inputage=new Scanner(System.in);
        int age=inputage.nextInt();
        if(age > 18){
            System.out.println("Driver's license approved");
        }else{
            System.out.println("You should apply for a learner's permit.");
        }

    }
}
