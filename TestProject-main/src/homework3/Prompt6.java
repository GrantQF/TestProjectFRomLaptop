package homework3;

import java.util.Scanner;

public class Prompt6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int number1= input.nextInt();
        System.out.println("Please enter the second number:");
        int number2=input.nextInt();
        System.out.println("Please enter the third number:");
        int number3= input.nextInt();

        if(number1>number2&&number1>number3){
            System.out.println(number1+" is the largest number.");
        } else if (number2>number1&&number2>number3) {
            System.out.println(number2+" is the largest number.");
        } else if (number3>number1&&number3>number2) {
            System.out.println(number3+" is the largest number.");
        }else {
            System.out.println("The numbers are the same.");
        }
    }
}
