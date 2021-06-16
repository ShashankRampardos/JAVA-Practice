import java.util.Scanner;
import java.lang.Math;
public class A3Q5
{
   public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
       int n;
      System.out.println("Enter length of array:");
      n=s.nextInt();
      int []a=new int[n];
      System.out.println("Enter values of array:");
      for(int i=0;i<a.length;i++)
        a[i]=s.nextInt();
      
       int count=0;
       for(int b:a)
       {
         double sqrt1=Math.sqrt(5*b*b+4);
         double sqrt2=Math.sqrt(5*b*b-4);
       //Checking if 5*b*b±4 is perfect square or not
        if(sqrt1-Math.floor(sqrt1)==0||sqrt2-Math.floor(sqrt2)==0)
           count++;  
       }
        System.out.println("Number of fibonacci terms in array:"+count);
        
      
    }
}