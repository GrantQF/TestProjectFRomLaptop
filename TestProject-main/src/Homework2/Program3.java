package Homework2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("How much is the loan?");
        Scanner inputloan= new Scanner(System.in);
        int loan=inputloan.nextInt();
        if(loan > 200000){
            System.out.println("Loan is rejected.");
        }else{
            System.out.println("Loan is accepeted");
        }
    }
}
