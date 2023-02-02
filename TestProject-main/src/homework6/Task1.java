package homework6;

public class Task1 {
    public static void main(String[] args) {
        String test="JamesKeenan";
        if (!test.isEmpty()){
            if(test.length() > 3 && test.length()%2!=0){
                System.out.println(test.charAt(test.length()/2));
            }
      }
    }
}
