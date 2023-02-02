package class14;

public class MethodPractice2 {
    void reversestr(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }String reverseStr(String input){
        String newStr="";
        for(int i=input.length()-1;i>=0;i--){
            newStr+=input.charAt(i);
        }
        return newStr;
    }
}
