package class8;

public class Arrays3 {
    public static void main(String[] args) {
        int number=10;
        int [] numbers=new int[5];
        System.out.println(numbers[2]);
        numbers[0]=50;
        numbers[1]=30;
        numbers[2]=55;
        numbers[3]=60;
        numbers[4]=52;
        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
