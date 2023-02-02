package class15;

public class TaskTester {
    public static void main(String[] args) {
        SyntaxEmployee task=new SyntaxEmployee();
        task.empID="123abc";
        task.salary=100000;
        System.out.println("Employee id is "+task.empID+", salary is "+task.salary+", CEO is "+task.CEO);

        SyntaxEmployee task2=new SyntaxEmployee();
        task.empID="456def";
        task.salary=120000;
        System.out.println("Employee id is "+task.empID+", salary is "+task.salary+", CEO is "+task.CEO);
    }
}
