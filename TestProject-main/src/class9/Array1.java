package class9;

public class Array1 {
    public static void main(String[] args) {
        int[] arr={10,12,20,25,45,50};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr[i]=0;
            }
        }
    }
}
