
public class CallStudent {

    public static void main(String[] args) {
        System.out.println("FAMESBL");
        Student fame = new Student();
        System.out.println("Object fame = "+fame);
        fame.addCourse();
        fame.dropCourse();
        fame.payment();
        fame.enrollment();
        System.out.println("=========================");
        
        //crete object GraduateStudent
        GraduateStudent gradu = new GraduateStudent();
        System.out.println("Objact gradu = "+gradu);
        gradu.oralExamination();
        gradu.thesisExamination();
        gradu.addCourse();
        gradu.enrollment();
        gradu.dropCourse();
        gradu.payment();
    }
}// end class
