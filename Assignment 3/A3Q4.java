import java.util.Scanner;
public class A3Q4
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
      int j;
       for(int b:a)
       {
          for(j=2;j<b;j++)
           {
              if(b%j==0)
                break;
           }
             if(j==b)
              count++;
       }
       System.out.println("Number of Primes in Array:"+count);

      
    }
}