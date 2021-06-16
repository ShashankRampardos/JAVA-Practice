import java.util.*;
public class A3Q2
{
  public static void main(String[]args)
   {
      Scanner s=new Scanner(System.in);
      int n;
      System.out.println("Enter Value of n:");
      n=s.nextInt();

      int []a=new int[n];
           System.out.println(a.length);
      for(int i=0;i<a.length;i++)
       {
          a[i]=s.nextInt();
       }
       n=n%2==0?(int)((n-2)/2):(int)((n-1)/2);
       // Mistakes:1)put above statement in below loop condition.
//                 2)put i<a.length in below loop condition.
  //               3)in above statement operator precidence pe dhan nahi diya
      for(int i=0,j=(a.length-1);i<n;i++,j--)
       {
          a[i]=a[i]+a[j];
          a[j]=a[i]-a[j];
          a[i]=a[i]-a[j];
       }
       System.out.print("Array Reversed:");
      for(int x:a)
       System.out.print(" "+x);
   }
}