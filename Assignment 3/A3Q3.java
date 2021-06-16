import java.util.Scanner;
public class A3Q3
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
      
       int oddSum=0;
       int evenSum=0; 
       for(int b:a)
       {
          if(b%2==0)
          evenSum+=b;
          else
          oddSum+=b;  
       }
       System.out.println("Even element sum:"+evenSum+"\nOdd element sum:"+oddSum);

      
    }
}