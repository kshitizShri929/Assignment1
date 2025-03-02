import java.util.Scanner;

public class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int digit = sc.nextInt();  

        System.out.println("The sum of digits is: " + digitSum(digit));  

    
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;  
            sum += lastDigit;  
            n = n / 10;  
        }
        return sum;  
    }
}

