import java.util.Scanner;

public class LargestofTwo
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Two Numbers: ");
      int x = scan.nextInt();
      int y = scan.nextInt();
      
      System.out.println("\nLargest = " +LargestOfTwo(x, y));
   }
   public static int LargestOfTwo(int a, int b)
   {
      return (a>b) ? a:b;
   }
}