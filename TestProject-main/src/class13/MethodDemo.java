package class13;

public class MethodDemo {
    public static void main(String[] args) {
        ArrayAddMachine hw=new ArrayAddMachine();

        int [] array1={10,20,30,45,50};
        int sum=0;
        for (int number:array1){
            sum+=number;
        }
        System.out.println(sum);
        int[] array2={10,10,10,20,30};
        int sum2=0;
        for (int number:array2){
            sum2+=number;
        }
        System.out.println(sum2);
        System.out.println("********************************************************");
        hw.addarrayElements(array1);
        hw.addarrayElements(array2);
    }
}
