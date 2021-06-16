//Assignment 1 Question 3
import java.util.Scanner;
public class A2Q3
{
  public static void main(String[]args)
   {
     Scanner s=new Scanner(System.in);
     int a=0,b=0;
  System.out.println("Enter Upper limit and Lower limit:");
    a=s.nextInt();
    b=s.nextInt();

System.out.print("Prime Numbers between "+a+" and "+b+" are:");
   L1:for(int i=(a==1)?a+1:a;i<=b;i++)
    {
       L2:for(int j=2;j<i;j++)
          {
          if(i%j==0)
            continue L1;
          }
System.out.print(i+" ");
    }
   }
}