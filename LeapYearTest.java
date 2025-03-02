import java.util.Scanner;


public class LeapYearTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the year as a 4-digit number:");
        int year = sc.nextInt();
        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("A Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        
    }
}

