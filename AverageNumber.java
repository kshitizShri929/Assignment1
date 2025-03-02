import java.util.Scanner;

public class AverageNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter three number for find of Averange Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = sc.nextInt();
        int sum= a+b+c;
        float Avg= sum/3;
        //System.out.printf("Avarange Number is :" ,Avg); why skip it

        System.out.printf("Average Number is: %.2f%n", Avg);

        
    }
}
