package class16;

public class Student {
    String id;
    String name;
    int age;
    double weight;
    Student(String sname, String sid, int sage, double sweight){
        name=sname;
        age=sage;
        weight=sweight;
        id=sid;
    }
    void printinfo(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }
}
