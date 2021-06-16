import java.util.Scanner;
public class A2Q2
{
  public static void main(String[]args)
  {
     boolean what=true;
     Scanner s = new Scanner(System.in);
     short a=0,b=0;
     while(what)
     {
       what=false;
       System.out.println("Enter lower limit and upper limit:");
       a=s.nextShort();
       b=s.nextShort();
       if(a==b){
       System.out.println("Upper and lower limit cannot be same");
       what=true;
               }  
     }
     for(int i=a;i<=b;i++)
     {
      if(i%15==0)
      {
        System.out.println("Number is divisible by 3 and 5 both:"+i);
      }
      
     }
  
  }
}