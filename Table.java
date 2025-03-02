import java.util.Scanner;

public class Table {

    public static void TableOf (int num){
            for (int i=1;i<=10;i++)
                
             System.out.println(num*i);
    
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the number to find of Table");
            int num=sc.nextInt();
            
        System.out.println("The of Table "+ num);
        TableOf( num);
        

        
    }
}
