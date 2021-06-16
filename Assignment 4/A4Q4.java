import java.lang.Math;
import java.util.Scanner;

public class A4Q4
{
  public static void main(String[]args)
   {
       Scanner s=new Scanner(System.in);
       int n;
       System.out.println("Enter an Integer number to find length of it");
       n=s.nextInt();
       int len=(int)(Math.log10(n)+1);
       int []a=new int[len];
       int I=0;
       while(n!=0)  
       { 
         a[I]=n%10;
         n=(int)(n/10);
        I++;
       }
      len=len%2==0?len/2-1:(n-1)/2;
      for(int i=0,j=a.length-1;i<=len;i++,j--)
        {
             int t;
              t=a[i];
           a[i]=a[j];
           a[j]=t;
        }
     // System.out.print(" "+i+" ");
           System.out.print("Array Values:");
         for(int x:a)
           System.out.print(x+" ");
 
             
   }
}