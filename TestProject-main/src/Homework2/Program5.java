package Homework2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        System.out.println("Please enter your City:");
        Scanner inputcity=new Scanner(System.in);
        String city=inputcity.nextLine();
        System.out.println("Please enter the temperature in Fahrenheit:");
        Scanner inputtemp=new Scanner(System.in);
        double tempf=inputtemp.nextDouble();
        double tempc=(tempf -32)*5/9;
        System.out.println("The temperature in "+city+" is "+tempc);
    }
}
