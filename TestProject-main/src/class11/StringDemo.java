package class11;

import java.sql.SQLOutput;

public class StringDemo {
    public static void main(String[] args) {
        String strobj=new String("java");
        String strobj2="java";
        System.out.println(strobj2.length());
        int len=strobj.length();
        System.out.println(len);
        String name="James Keenan";
        if(name.length()>10){
            System.out.println("Name cannot contain more than 10 characters");
        }
    }
}
