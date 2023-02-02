package Homework2;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        System.out.println("Please enter years worked:");
        Scanner inputwy = new Scanner(System.in);
        int wy = inputwy.nextInt();
        System.out.println("Please enter annual salary:");
        Scanner inputsalary = new Scanner(System.in);
        double salary = inputsalary.nextDouble();
        if (wy >= 5) {
            if (salary > 50000) {
                int bonus = 5000;
                System.out.println("You are eligible for a bonus of: " + bonus);
            } else {
                int bonus = 3000;
                System.out.println("You are eligible for a bonus of: " + bonus);
            }
        } else {
            System.out.println("You are not eligible for a bonus.");
        }
    }
}