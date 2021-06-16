import java.util.Scanner;
public class A4Q5
{
  public static void main(String[]args)
   {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter rows and columns of array:");
     int m=s.nextInt();
     int n=s.nextInt();
     
     int [][]a;
     a=new int[m][n];
     
     System.out.println("Fill the array enter "+m*n+" values:");
     for(int i=0;i<a.length;i++)
      {
         for(int j=0;j<a[i].length;j++)
          {
             a[i][j]=s.nextInt();
          }
      }
  System.out.println("Array:"); 
       for(int []b:a)
       { 
          System.out.print("|"); 
         for(int x:b)
          {
           System.out.print(x);   
          }
         System.out.print("|\n"); 
       }
  
      int sum=0;
      for(int i=0;i<a.length;i++)
       {
         for(int j=0;j<a[i].length;j++)
          {
             if(j==a[i].length-1)
            sum=sum+a[i][j];
          }
       }
        System.out.println("Border values of each array:"+sum);
   }
}