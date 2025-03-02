import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a number for Test positive or negative");
        int a=sc.nextInt();
        if (a > 0)
        System.out.println("The number is a Positive number");
        else if (a<0)
        System.out.println("The number is Negative a number");
        else 
        System.out.println("The number Neither Positive number Nor Negative a number");
        
    }
}
