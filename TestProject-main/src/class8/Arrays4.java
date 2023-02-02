package class8;

public class Arrays4 {
    public static void main(String[] args) {
        int [] numbers=new int [5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        for(int i = 0; i < numbers.length; i=i+2){
            System.out.println(numbers[i]);
        }
        System.out.println("****************************");
        int [] num={10,20,30,4,5,6,7,80};
        int sum=0;
        for (int a=0; a <num.length; a++) {
            if (num[a] % 2 == 0) {
                sum = sum + num[a];
            }
        }
        System.out.println(sum);

        }
    }

