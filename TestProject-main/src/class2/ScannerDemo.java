package class2;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        /*Scanner input= new Scanner(System.in);
        System.out.println("please enter your name");
        String name=input.nextLine();
        System.out.println("My name is "+(name));
*/
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("you are "+age+" years old");

    }
}
