package class15;

public class AccessOfVariables {
    //private variable cannot be import from this class to another class
    private double bankBalance=1250000;
    //public variable any class in project can import this variable not just ones in the same package
    public String address="Street 123";
    String name="John Smith";

    public static void main(String[] args) {
        AccessOfVariables test=new AccessOfVariables();
        System.out.println(test.address+" "+test.name+" "+test.bankBalance);

    }
}
