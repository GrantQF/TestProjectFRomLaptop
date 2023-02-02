package homework7;

public class task3 {
    public static void main(String[] args) {
        String test="Is it saturday? Is it raining? Do we have Java Class today?";
        String[] test2=test.split("[?]");
        int count=0;
        for(int i=0;i<test2.length;i++){
            count++;
        }
        System.out.println(count);

    }
}
