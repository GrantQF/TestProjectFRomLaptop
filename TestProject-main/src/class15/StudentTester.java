package class15;

public class StudentTester {
    public static void main(String[] args) {
        StudentMethod student=new StudentMethod();
        student.name="Jamy";
        student.id="123";
        student.age=30;

        StudentMethod student2=new StudentMethod();
        student.name="Grant";
        student.id="456";
        student.age=30;

        StudentMethod student3=new StudentMethod();
        student.name="Mike";
        student.id="789";
        student.age=31;
        System.out.println(student.schoolname);

    }
}
