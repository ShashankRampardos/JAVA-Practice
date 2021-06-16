import java.util.Scanner;
import java.lang.Math;
public class A2Q4
{
   public static void main(String[]args)
   {
    short n=0;
    boolean what=true;
    Scanner s=new Scanner(System.in);
    
    
    byte count=0;
    short m;
    while(what)
    {
     System.out.println("Enter a integer of digit 1 to 4:"); 
     n=s.nextShort();
      m=n;
      count=0;
      while(m!=0)
      { count++;
        m=(short)(m/10); 
      }
     what=count>=1&&count<=4?false:true;
     if(what)
      System.out.println("Bola na 1 se 4 ke beach ka digit dal!"); 
      
    }
m=n;
short a=0;
   while(m!=0)
  {
   short t;
   t=(short)(m%10);
   a=(short)(a+Math.pow(t,count));
   m=(short)(m/10);
  }
    if(a==n)
     System.out.println("The number is an Armstrong number");
    else
     System.out.println("The number is not an Armstrong number");
   }
}
