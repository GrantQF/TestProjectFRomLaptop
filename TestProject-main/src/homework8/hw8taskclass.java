package homework8;

public class hw8taskclass {
    int comparelarger(int num1, int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
    String oddoreven(int num1){
        String result=new String();
        if(num1%2==0){
            result="even";
        }else {
            result="odd";
        }return result;
    }
    String palindromecheck(String word){
        String reverse=new String();
        String result=new String();
        for (int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }if(word.equalsIgnoreCase(reverse)){
            result="palindrome";
        }else {
            result="not a palindrome";
        }return result;
    }
    String primecheck(int num1){
        String result=new String();
        for (int i=2; i<=num1; i++){
            if(num1%i==0){
                result="not a prime number";
            }else {
                result="prime number";
            }

        }return result;
    }
    Character getgrade(int num1){
        char grade='F';
        if (num1>=90){
            grade='A';
        }else if(num1>=80){
            grade='B';
        } else if (num1>=70) {
            grade='C';
        } else if (num1>=60) {
            grade='D';
        }else{
            grade='F';
        }
        return grade;
    }

}
