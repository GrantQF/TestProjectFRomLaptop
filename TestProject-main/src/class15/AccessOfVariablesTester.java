package class15;

public class AccessOfVariablesTester {
    public static void main(String[] args) {
        AccessOfVariables test=new AccessOfVariables();
        //test.bankBalance is a private variable and cannot be imported
        System.out.println(test.address+" "+test.name/*+" "+test.bankBalance*/);
        System.out.println(test.address+" "+test.name);
    }
}
