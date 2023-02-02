package homework10;

public class Task2Class {
    String studentname;
    int mathgrade;
    int historygrade;
    int sciencegrade;
    int average;
    Task2Class(String sname, int mgrade, int hgrade, int sgrade){
        studentname=sname;
        mathgrade=mgrade;
        historygrade=hgrade;
        sciencegrade=sgrade;
        average=(mgrade+hgrade+sgrade)/3;
    } void printinfo(){
        System.out.println(studentname+" has an average grade of "+average);
    }
}
