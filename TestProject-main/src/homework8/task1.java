package homework8;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        hw8taskclass hw=new hw8taskclass();
        System.out.println("Please enter two numbers");
        int number1= input.nextInt();
        int number2= input.nextInt();
        System.out.println(hw.comparelarger(number1, number2));
    }
}
