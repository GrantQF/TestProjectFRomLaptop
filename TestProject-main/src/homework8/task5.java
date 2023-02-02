package homework8;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        hw8taskclass hw=new hw8taskclass();
        System.out.println("Please enter a number");
        int number= input.nextInt();
        System.out.println(hw.primecheck(number));

    }
}
