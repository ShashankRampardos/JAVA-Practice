import java.util.Scanner;
public class A2Q5
{
  public static void main(String[]args)
   {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter Upper limit and lower limit number to check Even between them:");
     int a=s.nextInt();
     int b=s.nextInt();
     System.out.println("Enter Nth positon value in Even number series:");
     int p=s.nextInt();
     
System.out.print(p+"th place Even numbers are:");
    for(int j=1,i=a;i<=b;i++,j++)
     {
       if(i%2==0)
        {
          if(j%p==0)
            System.out.print(i+" ");      
        }
     }
   } 
}