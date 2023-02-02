package class6;

import org.w3c.dom.ls.LSOutput;

public class WhileLoop2 {
    public static void main(String[] args) {
        int number=1;
        int sum=0;
        while (number<=10){
            sum=sum+number;
            number++;
        }
        System.out.println(sum);
    }

}
