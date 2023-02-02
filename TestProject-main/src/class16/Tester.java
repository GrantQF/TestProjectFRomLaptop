package class16;

public class Tester {
      static int calculator2(int num1, int num2){

          return num1+num2;
    }

    public static void main(String[] args) {
        int a=3, b=6;
        int sum= Tester.calculator2(a,b);
        System.out.println(sum);
        TestMethod test1=new TestMethod();
        TestMethod.name="Grant";
        TestMethod test2=new TestMethod();
        TestMethod.name="Jamy";

    }
}
