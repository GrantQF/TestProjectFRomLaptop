package class14;

import java.util.Scanner;

public class MethodTester2 {
    public static void main(String[] args) {
        MethodPractice2 hw=new MethodPractice2();
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word to reverse");
        String userinput= input.next();
        hw.reversestr(userinput);
        System.out.println("");

        System.out.println(hw.reverseStr("Troggoth"));

    }

}
