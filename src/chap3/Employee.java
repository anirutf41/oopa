package chap3;
public class Employee {
    static int id = 1001;
    String name = "Anirut";
    int age = 21;
    
    static void work () {
        System.out.println("work()");
    }
    
    void getSalary(){
        System.out.println("getSalary()");
    }
    
    public static void main(String[] args) {
        //call static attr & method
        System.out.println("id : "+id);
        work();
        
        //call non-static
        Employee a = new Employee();
        System.out.println("name : "+a.name);
        System.out.println("age : "+a.age);
        a.getSalary();
    }
}
