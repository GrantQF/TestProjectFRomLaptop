package class12;

public class ReplaceMethod {
    public static void main(String[] args) {
        String str="qwertyuiopQWERTYUIOP1234567890!@#$%^&*()";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        // '^' operator = '!' operator
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));


    }
}
