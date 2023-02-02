package class8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two Numbers starting point and ending point");
        int start = input.nextInt();
        int end = input.nextInt();
        int evensum=0;
        int oddsum=0;
        for (int i = start; i <= end; i++) {
            if(i%2==0){
                evensum+=i;
            } if(i%2!=0){
                oddsum+=i;
            }

        }
        System.out.println("Sum of all the Even numbers "+evensum);
        System.out.println("Sum of all the Even numbers "+oddsum);
    }
}
