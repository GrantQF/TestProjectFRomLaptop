package Homework2;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        System.out.println("Do you have a credit card? Yes or No");
        Scanner inputcc=new Scanner(System.in);
        String creditcard=inputcc.nextLine();
        if("Yes".equals(creditcard)){
            System.out.println("What is the balance?");
            Scanner inputbalance=new Scanner(System.in);
            double balance=inputbalance.nextDouble();
            if(balance > 1000){
                System.out.println("Pay off immediately.");
            }else{
                System.out.println("You can spend more.");
            }
        }else if("No".equals(creditcard)){
            System.out.println("Do you want to open a credit card?");
        }else{
            System.out.println("Invalid input, please try again.");
        }
    }
}
