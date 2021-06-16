abstract class Employee
{
  String name;
  double salary;
  double bonus;
  double commission;
  String designation;
  
public String getName()
  {
    return name;
  }
public String getDesignation()
  {
    return designation;
  }
public double getSal()
  {
    return salary;
  }
public double getBonus()
  {
    return bonus; 
  }
public double getComm()
  {
    return commission; 
  }
public abstract double totalIncome();
}
class Manager extends Employee
{
   Manager(String n,double sl,double bn,double com,String des)
    {
       name=n;salary=sl;bonus=bn;commission=com;designation=des;
    }  

  public double totalIncome()
   {
      return salary+bonus+commission;
   } 
}
class SalesMan extends Employee
{
  SalesMan(String n,double sl,double com,String des)
    {
       name=n;salary=sl;commission=com;designation=des;
    }  
  public double totalIncome()
   {
      return salary+commission;
   } 
}
class Developer extends Employee
{
   Developer(String n,double sl,double bn,String des)
    {
       name=n;salary=sl;bonus=bn;designation=des;
    }  
  public double totalIncome()
   {
      return salary+bonus;
   } 
}

public class A6Q3
{
   public static void main(String[]args)
     {
        Employee[]e=new Employee[3];
        e[0]=new Manager("Mgr Sharma",40000,1000,1500,"Manager");
        e[1]=new SalesMan("Sales Sharma",15000,150,"SalesMan");
        e[2]=new Developer("MahaDev",40000,1000,"Developer");
   for(Employee x:e)
   {
     System.out.println(x.getDesignation());
     System.out.println("Name:"+x.getName());
     System.out.println("Salary:"+x.getSal());
     System.out.println("Bonus:"+x.getBonus());
     System.out.println("Commission:"+x.getComm());
     System.out.println("TotalIncome:"+x.totalIncome()+"\n");
   }     
       
     }
}


