package Homework2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Enter mortgage price");
        Scanner inputPrice= new Scanner(System.in);
        int mortgageprice= inputPrice.nextInt();
        System.out.println("Enter mortgage rate");
        Scanner inputRate = new Scanner(System.in);
        double mortgagerate = inputRate.nextDouble();
        if (mortgagerate>= 4.5) {
            System.out.println("Do not buy house");
        } else {
            System.out.println("Buy house");
            if (mortgageprice > 200000) {
                System.out.println("Take a loan");
            } else {
                System.out.println("Pay in cash");
            }
        }
    }
}