package chap4;
import java.util.Scanner;

public class ProgramIsCreatedByAnirut {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int menu = 0;
        System.out.println("----------------Menu----------------");
        System.out.println("0 : Exit");
        System.out.println("1 : Normal Letter");
        System.out.println("2 : Register Letter");
        System.out.println("3 : EMS Letter");
        System.out.println("------------------------------------");
        
        do
        {            
            System.out.print("\nPlease Enter Menu [0-3] : ");
            menu = sc.nextInt();
            if (menu==1)
            {
                System.out.println("1. Normal Letter");
                System.out.print("\t"+"Enter Weight (g) : ");
                int grum = sc.nextInt();
                if (grum<1) 
                {
                    System.out.println("***** โปรดกรอก 1 กรัมขึ้นไป *****");
                }
                else if (grum>2000)
                {
                    System.out.println("***** โปรดกรอกไม่เกิน 2000 กรัม *****");
                }
                else if (grum<=20) 
                {
                    System.out.println("\t"+"Normal Letter Service Price : 3 baht");
                }
                else if(grum>=21 && grum<=100)
                {
                    System.out.println("\t"+"Normal Letter Service Price : 5 baht");
                }
                else if(grum>=101 && grum<=250)
                {
                    System.out.println("\t"+"Normal Letter Service Price : 9 baht");
                }
                else if(grum>=251 && grum<=500)
                {
                    System.out.println("\t"+"Normal Letter Service Price : 15 baht");
                }
                else if(grum>=501 && grum<=1000)
                {
                    System.out.println("\t"+"Normal Letter Service Price : 25 baht");
                }
                else if(grum>=1001 && grum<=2000)
                {
                    System.out.println("\t"+"Normal Letter Service Price : 45 baht");
                }
            }
            
            else if(menu==2)
            {
                System.out.println("2. Register Letter");
                System.out.print("\t"+"Enter Weight (g) : ");
                int grum = sc.nextInt();
                
                if (grum<1) 
                {
                    System.out.println("***** โปรดกรอก 1 กรัมขึ้นไป *****");
                }
                else if (grum>2000)
                {
                    System.out.println("***** โปรดกรอกไม่เกิน 2000 กรัม *****");
                }
                else if (grum<=20) 
                {
                    System.out.println("\t"+"Register Letter Service Price : "+(3+13)+"baht");
                }
                else if(grum>=21 && grum<=100)
                {
                    System.out.println("\t"+"Register Letter Service Price : "+(5+13)+"baht");
                }
                else if(grum>=101 && grum<=250)
                {
                    System.out.println("\t"+"Register Letter Service Price : "+(9+13)+"baht");
                }
                else if(grum>=251 && grum<=500)
                {
                    System.out.println("\t"+"Register Letter Service Price : "+(15+13)+"baht");
                }
                else if(grum>=501 && grum<=1000)
                {
                    System.out.println("\t"+"Register Letter Service Price : "+(25+13)+"baht");
                }
                else if(grum>=1001 && grum<=2000)
                {
                    System.out.println("\t"+"Register Letter Service Price : "+(45+13)+"baht");
                }
            }
            
             else if(menu==3)
            {
                System.out.println("3. EMS Letter");
                System.out.print("\t"+"Enter Weight (g) : ");
                int grum = sc.nextInt();
                
                if (grum<1) 
                {
                    System.out.println("***** โปรดกรอก 1 กรัมขึ้นไป *****");
                }
                else if (grum>2000)
                {
                    System.out.println("***** โปรดกรอกไม่เกิน 2000 กรัม *****");
                }
                else if (grum<=20) 
                {
                    System.out.println("\t"+"EMS Letter Service Price : 27 baht");
                }
                else if(grum>=21 && grum<=100)
                {
                    System.out.println("\t"+"EMS Letter Service Price : 32 baht");
                }
                else if(grum>=101 && grum<=250)
                {
                    System.out.println("\t"+"EMS Letter Service Price : 37 baht");
                }
                else if(grum>=251 && grum<=500)
                {
                    System.out.println("\t"+"EMS Letter Service Price : 47 baht");
                }
                else if(grum>=501 && grum<=1000)
                {
                    System.out.println("\t"+"EMS Letter Service Price : 62 baht");
                }
                else if(grum>=1001 && grum<=2000)
                {
                    System.out.println("\t"+"EMS Letter Service Price : 77 baht");
                }
            }
            else if(menu==0)
            {
                System.out.println("***** จบการทำงาน *****");
            }
            else
            {
                System.out.println("\n***** โปรดกรอก 0-3 *****");
            }
        } while (menu!=0);
        
    }
    
}
