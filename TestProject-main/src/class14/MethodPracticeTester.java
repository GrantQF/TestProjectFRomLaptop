package class14;

import java.util.Scanner;

public class MethodPracticeTester {
    public static void main(String[] args) {
        MethodPractice hw=new MethodPractice();
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int userinput= input.nextInt();
        hw.oddeventest(userinput);
        System.out.println(hw.isEven1(userinput));
        System.out.println("********************************");
        int[] arr={100,12,20};
        for (int number:arr){
            System.out.print(hw.isEven1(number)+" ");
        }

    }
}
