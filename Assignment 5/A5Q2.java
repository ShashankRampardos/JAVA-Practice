import java.util.Scanner;
class Employee
{
   private int id;
   private String name;
   private int sal;
   private int commision;
   private static int minPay;
   public static Employee ref;
   private static int count;   


   Employee(int r,String s,int sl,int commision)
   {
     id=r; name=s; sal=sl; this.commision=commision;
     if(minPay>sal+commision){
       minPay=sal+commision;
       ref=this;
                         }
       count++;
   }
    void getE()
    {
      System.out.println("Name:"+name+"\nId:"+id+"\nTotalPay:"+(sal+commision));
    }
   public Employee getRef()
    {
      return this;
    }
   public static void countE()
   {
      System.out.println("Number of Emploies are:"+count);
   } 
   
}
public class A5Q2
{
  public static void main(String[]args)
    {
      System.out.println("Enter Number of Emploies:");
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();        
      Employee []s=new Employee[n];
      
      for(int i=0;i<s.length;i++)
        {
           int r,sl,com;
           String st;
           System.out.println("Enter id, salary, name and commision");
           r=sc.nextInt();
           sl=sc.nextInt();
           sc.nextLine();
           st=sc.nextLine();
           com=sc.nextInt();          
           s[i]=new Employee(r,st,sl,com);
        }

       Employee.countE();
       Employee.ref.getE();
    }
}