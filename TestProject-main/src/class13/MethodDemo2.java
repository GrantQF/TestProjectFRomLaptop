package class13;

public class MethodDemo2 {
    void printHello(){
        System.out.println("Hello World");
        System.out.println("");
    }
    void printHellowManyTimes(int times){
        for(int i=0;i<times;i++){
            System.out.println("Hello World");
        }System.out.println("");
    }
    void printManyTimes(int times, String word){
        for (int i=0;i<times;i++){
            System.out.println(word);
        }System.out.println("");
    }
}
