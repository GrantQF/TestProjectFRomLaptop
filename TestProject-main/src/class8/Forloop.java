package class8;

import java.util.Scanner;

public class Forloop  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.println("Do you want a credit card");;
            String userinput=input.next();
            if(userinput.equalsIgnoreCase("yes")){
                break;
            }
        }
    }
}
