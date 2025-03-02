import java.util.Scanner;

public class ProductCast {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the cast of product as Pen ,Pencil, Eraser ");
        float Pen=sc.nextFloat();
        float Pencil=sc.nextFloat();
        float Eraser = sc.nextFloat();
        
        float Bill= Pen+Pencil+Eraser;
        //System.out.printf("Avarange Number is :" ,Avg); why skip it

        System.out.printf("Bill of items is: %.2f%n", Bill);
    }
}
