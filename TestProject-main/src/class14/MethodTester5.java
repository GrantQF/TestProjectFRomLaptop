package class14;

import java.util.Scanner;

public class MethodTester5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MethodPractice5 hw=new MethodPractice5();
        System.out.println("Please enter your first name");
        String fname= input.next();
        System.out.println("Please enter your last name");
        String lname= input.next();
        System.out.println("Please enter email type");
        String emailtype= input.next();
        System.out.println(hw.createEmail(fname,lname,emailtype));

    }
}
