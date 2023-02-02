package class12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //StringBuilder creates a new variable without referencing any variables in memory
        StringBuilder stringbuilder=new StringBuilder("Sunday");
        System.out.println(stringbuilder.reverse());
    }

}
