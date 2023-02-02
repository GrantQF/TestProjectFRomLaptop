package class9;

public class EnhancedForLoops {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int number : arr) {
            System.out.println(number);
        }
        System.out.println("***********************************************");
        String[] friends = {"jamy", "mike", "matt", "grant"};
        for (String name : friends) {
            System.out.print(name + " ");
        }
        System.out.println("");
        System.out.println("***********************************************");
        int[] arr2={10,13,20,25,45,50};
        for (int odd:arr2){
            if(odd%2!=0){
                System.out.println(odd);
            }
        }for (int i=0; i<arr2.length;i++){
            if(arr2[i]%2!=0){
                System.out.println(arr2[i]);
            }
        }
    }
}
