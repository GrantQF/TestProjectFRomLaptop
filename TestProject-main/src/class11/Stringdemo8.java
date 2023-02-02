package class11;

import java.util.Scanner;

public class Stringdemo8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your username");
        String username= input.next();
        System.out.println("Please Enter your password");
        String password= input.next();
        System.out.println("Please Enter your password again");
        String confirmpassword= input.next();
        if (username.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        }else if(password.length()<8){
            System.out.println("Password must contain atleast 9 characters");
        }else if(password.contains(username)){
            System.out.println("Password cannot contain username");
        }else if(!password.equals(confirmpassword)){
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password are set.");
        }

    }
}
