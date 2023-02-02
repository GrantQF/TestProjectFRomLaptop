package class11;

public class Stringdemo11 {
    public static void main(String[] args) {
        String str="Java is a pain";
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("a"));
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" has the index of "+i);
        }
    }
}
