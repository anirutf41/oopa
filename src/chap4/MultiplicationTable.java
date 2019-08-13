package chap4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int width = 12;
        int height = 12;
        System.out.println("---------------------------------------------- Multiplication Table ------------------------------");
        for (int i = 1; i <= height; i++) {
            System.out.print("\t"+i);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (int i = 2; i <= height ; i++) {
            System.out.print(i  +")>");
            for (int j = 1; j <= width ; j++) {
                System.out.print("\t"+ (i * j));
            }
            System.out.println();
        }
    }
}
