import java.util.Scanner;

public class A4Q2
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
  
      int position=0;      
       for(int i=0;i<a.length;i++)
        {
          int t;
           if(a[i]>=0) 
            {
              t=a[i];
           a[i]=a[position];
    a[position]=t;
           position++;
            }
           
        }
           System.out.print("Array Values:");
      for(int x:a)
        {
           System.out.print(x+" ");
        }
             
   }
}