package chap3;

public class CallEmployee {
    public static void main(String[] args) {
        //call static attr & method
        System.out.println("id : "+Employee.id);
        Employee.work();
        
        //call non-static
        Employee a = new Employee();
        System.out.println("name : "+a.name);
        System.out.println("age : "+a.age);
        a.getSalary();
    }
}
