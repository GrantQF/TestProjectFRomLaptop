package homework5;

public class task6 {
    public static void main(String[] args) {
        String[][] countries={
            {"USA", "Canada","Mexico"},
            {"Brazil", "Argentina","Peru","Colombia","Chile"},
            {"Germany","United","Kingdom","France","Spain"},
            {"China","India","Japan","Russia"},
        {"Egypt","Nigeria","South Africa","Ethiopia"},
        };
        System.out.println(countries[3].length);
        int counter=0;
        for(String [] country:countries){
            for (String s : country){
                System.out.println(s+" ");
        //for (int i=0;i<countries.length;i++){
          //  for (int j=0;j<countries[i].length;j++){
               // System.out.println(countries[i][j]+" ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("total countires "+counter);
    }
}
