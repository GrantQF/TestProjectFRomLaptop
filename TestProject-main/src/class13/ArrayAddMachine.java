package class13;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int [] array2={10,10,10,20,30};
    }
    void addarrayElements(int [] arr){
        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        System.out.println(sum);
    }
}
