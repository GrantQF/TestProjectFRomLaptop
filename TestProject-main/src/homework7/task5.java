package homework7;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word to check if it is a palindrome");
        String test= input.next();
        StringBuilder testreverse=new StringBuilder(test);
        String test2=testreverse.toString();
        if (test==test2.trim()){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
