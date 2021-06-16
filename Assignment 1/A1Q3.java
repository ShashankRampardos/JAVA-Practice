import java.util.Scanner;
public class A1Q3
{
  public static void main(String[]arr)
   {
     Scanner s=new Scanner(System.in);
   System.out.println("Enter three Sides of a trinagle:");
   short x=s.nextShort();
   short y=s.nextShort();
   short z=s.nextShort();
//  (x>y?x>z?x:y>z?y:z:z>y?z:y)*(x>y?x>z?x:y>z?y:z:z>y?z:y)
if(x*x==y*y+z*z)
System.out.println("It is a Right Triangle");
else if(y*y==x*x+z*z)
System.out.println("It is a Right Triangle");
else if(z*z==x*x+y*y)
System.out.println("It is a Right Triangle");
else
System.out.println("It is not a Right Triangle");   
   }
}