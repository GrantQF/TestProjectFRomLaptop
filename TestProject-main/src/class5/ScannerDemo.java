package class5;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        System.out.println("Please enter your age:");
        int age= scan.nextInt();
        System.out.println("Your are "+age+" years old");
        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);
        */
        System.out.println("please enter your name");
        String name=scan.next();
        System.out.println("Your name is "+name);

        scan.nextLine();
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);

    }
}
