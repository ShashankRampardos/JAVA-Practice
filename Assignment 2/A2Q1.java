import java.util.Scanner;
public class A2Q1
{
  public static void main(String[]args)
    {
       //String sym;
       //int var1,var2;
       boolean what=true;      
       Scanner s=new Scanner(System.in);
        while(what)
         {
           System.out.println("Enter two numbers:");
          int var1=s.nextInt();
          int var2=s.nextInt();
           System.out.println("Enter + or - or x or / :");
          
          String sym=s.nextLine();
           sym=s.nextLine();
             
           switch(sym)
            {
               case "+":
                System.out.println("Sum is"+(var1+var2));
               break;        
               case "-":
                System.out.println("Difference is"+(var1-var2));
               break;
               case "x":
                System.out.println("Multiplication is"+(var1*var2));
               break;
               case "/":
                System.out.println("Division is"+(var1/var2));
               break;
               default:
                 System.out.println("Enter Correct symbol");
                continue;  
            }
                System.out.println("Do you want to continue(true/false):");
                what=s.nextBoolean();
                
         }
           
  
    }
}