package class5;

import java.util.Scanner;

public class SwtichDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender:");
        char gender=input.next().charAt(0);
        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Males");
                break;
            default:
                System.out.println("Not specified");
        }
    }
}
