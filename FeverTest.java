import java.util.Scanner;

public class FeverTest {
    public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter a temp in  for FaverTest");
      double temp = sc.nextDouble();
      if (temp > 100) {
         System.out.println("You have a fever.");
      
      } else {
         System.out.println("You don't have a fever.");
      }

   }
}
