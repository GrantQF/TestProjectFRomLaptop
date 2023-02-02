package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computers memory.
        int means what type of data we want store.
        box1 is name of the box
        = sign puts text after it into the box1
        10 is our value being stored in the box
         */
        int box1=10;
        System.out.println(box1);
        /* Boxes that can hold intergers: byte, short, int, long (number most be followed by l)
         */
        byte box2 = 127;
        System.out.println(box2);
/* why do you put L with an interger in a long box

 */
        short box3=1000;
        System.out.println(box3);
/*      float can store Decimals as long as the number is followed by F
        double can store dedicmals with more than one number after the decimal
 */
        float   mynumberbox=10.5f;
        double  mynumberbox2=3213548651.54684;
        System.out.println(mynumberbox);
        System.out.println(mynumberbox2);

        /* char can store a single character of any type within ''
            String can store a string of characters of any type within ""

         */
        char letter='s';
        char gender='M';
        char symbol='#';
        String name= "Grant";
        System.out.println("vaiables are " + letter +", "+ gender +", "+ symbol +", "+ name);

    }
}
