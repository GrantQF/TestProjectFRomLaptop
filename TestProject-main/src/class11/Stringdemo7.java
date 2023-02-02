package class11;

public class Stringdemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startsWith=str.startsWith("I");
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));

        System.out.println(str.toLowerCase().startsWith("i"));

        System.out.println(str.contains("java"));

    }
}
