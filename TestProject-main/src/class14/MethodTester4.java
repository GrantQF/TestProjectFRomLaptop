package class14;

import java.util.Scanner;

public class MethodTester4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MethodPractice4 hw=new MethodPractice4();
        System.out.println("Enter first number");
        int number1= input.nextInt();
        System.out.println("Enter second number");
        int number2= input.nextInt();
        System.out.println(hw.comparelarger(number1, number2));
    }
}
