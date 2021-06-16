import java.util.Scanner;
public class A2Q6
{
  public static void main(String[]args)
   {
     Scanner s=new Scanner(System.in);
     int n;
     byte k;
     System.out.println("Enter a integer number:");
     n=s.nextInt();
    System.out.println("Enter Nth position for the above number to display:");    
     k=s.nextByte();
    byte count=0;
    int m=n;
     while(m!=0)
     {  
       count++;
       m=(int)(m/10);
     }
    if(k>=count)
      System.out.println(k+"th digit not found");
    else
     {
        for(int i=1;i<=k;i++) 
         {
           
            m=(int)(n%10);
            
         }
       System.out.println(k+"th digit from last is:"+m);
     }
   }
}