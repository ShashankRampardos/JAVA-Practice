import java.util.Scanner;

public class A4Q1
{
  public static void main(String[]args)
   {
       Scanner s=new Scanner(System.in);
       int n;
       System.out.println("Enter length of array");
       n=s.nextInt();
       int []a=new int[n];
       
       System.out.println("Enter Values of array");
       for(int i=0;i<a.length;i++)
         a[i]=s.nextInt();
  
       int max=a[0];
       int min=a[0];
       for(int i=1;i<a.length;i++)
        {
           if(a[i]<min)
            min=a[i];
           if(a[i]>max)
            max=a[i];
        }
 
       System.out.println("MaxValueInArray:"+max+"\nMinValueInArray:"+min);          
   }
}