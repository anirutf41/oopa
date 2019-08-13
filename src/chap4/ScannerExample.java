package chap4;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entername : ");
        String name = sc.next();
        
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        
        System.out.print("Enter salary : ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter Degree : ");
        int degree = sc.nextInt();
        
        
        System.out.println("*********************");
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        if (age>=1 && age<=11) {
            System.out.println("=> วัยเด็ก");
        }
        else if (age>=12 && age<=20){
            System.out.println("=> วัยรุ่น");
        } 
        else if (age>=21 && age<=40){
            System.out.println("=> วัยผู้ใหญ่");
        }
        else if(age>=41 && age<=60){
            System.out.println("=> วัยกลางคน");
        }
        else if(age>=61 && age<=65){
            System.out.println("=> วัยสูงอายุ");
        }
        
        System.out.println("Salary is "+salary);
        switch(degree){
            case 1:
                System.out.println("ปริญญาตรี");
                break;
            case 2:
                System.out.println("ปริญญาโท");
                break;
            case 3:
                System.out.println("ปริญญาเอก");
                break;
            case 4:
                System.out.println("ไม่ระบุ");
                break;
        }
    }
}
