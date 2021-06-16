import java.util.Scanner;
public class A1Q1
{
  public static void main(String[]arr)
    {
     System.out.println("Enter a number:");
    Scanner s = new Scanner(System.in);
   int x=s.nextInt();
x=x>=0?x:-x;
System.out.println("Absolute number is "+x); 
   }   
}