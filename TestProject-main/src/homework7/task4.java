package homework7;

public class task4 {
    public static void main(String[] args) {
        String test="This is the sentence I want to reverse";
        String[] arr=test.split(" ");

        for(String word:arr)
        System.out.print(new StringBuilder(word).reverse()+" ");
    }
}
