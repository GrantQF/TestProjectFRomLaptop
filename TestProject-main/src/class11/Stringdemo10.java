package class11;

public class Stringdemo10 {
    public static void main(String[] args) {
        String str="fda$#%$45345 tg43$ 5fdsa*(";
        int counter=0;
        for (int i=0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total isAlphabetic in Str "+counter);
    }
}
