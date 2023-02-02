package homework8;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        hw8taskclass hw=new hw8taskclass();
        System.out.println("Please enter a word");
        String word= input.next();
        System.out.println(hw.palindromecheck(word));
    }
}
