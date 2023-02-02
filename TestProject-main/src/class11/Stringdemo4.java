package class11;

public class Stringdemo4 {
    public static void main(String[] args) {
        String str="";
        System.out.println(str.isEmpty());
        String str2="hi";
        System.out.println(str2.isEmpty());
        String str3="       ";
        boolean isEmpty=str3.isEmpty();
        System.out.println(isEmpty);
        System.out.println(str3.isBlank());
    }
}
