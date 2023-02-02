package homework8;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        hw8taskclass hw=new hw8taskclass();
        System.out.println("Enter your grade");
        int grade= input.nextInt();
        System.out.println(hw.getgrade(grade));
    }
}
