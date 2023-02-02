package homework7;

public class task2 {
    public static void main(String[] args) {
        String test="afds987698*&^(*&^adfAEDF";
        String testcount=test.replaceAll("[a-z,A-Z,0-9]","Z");
        int count=0;
        for (int i=0;i<testcount.length();i++){
            if(testcount.charAt(i)=='Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
