package class8;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        double total=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the item and its price");
            String itemname = input.next();
            double itemprice = input.nextDouble();
            total+=itemprice;
            System.out.println("This is the total amount that you have to pay " +total);
        }
        System.out.println("please pay for the items");
        double paid= input.nextDouble();
        if(paid > total) {
            double change=paid-total;
            System.out.println("Here is your change "+change);
        }
    }

}
