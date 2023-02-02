package class15;

public class TaskTester2 {
    public static void main(String[] args) {
        Students task=new Students();
        task.numberofstudents=0;
        Students task1=new Students();
        task1.name="Jamy";
        task1.id="123abc";
        task.numberofstudents++;
        Students task2=new Students();
        task2.name="Grant";
        task2.id="456def";
        task.numberofstudents++;
        Students task3=new Students();
        task3.name="Mike";
        task3.id="789ghi";
        task.numberofstudents++;
        System.out.println(task.numberofstudents);

    }
}
