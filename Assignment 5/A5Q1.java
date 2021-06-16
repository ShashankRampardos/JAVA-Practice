import java.util.Scanner;
class Student
{
   private int rollNo;
   private String name;
   private int totalMarks;
   public static int mark;
   public static Student ref;
   Student(int r,String s,int tM)
   {
     rollNo=r; name=s; totalMarks=tM;
     if(totalMarks>mark){
       mark=totalMarks;
       ref=this;
                         }
   }
    void getD()
    {
      System.out.println("Name of Topper:"+name+"\nRollNo:"+rollNo+"\nTotalMarks:"+totalMarks);
    }
   
}
public class A5Q1
{
  public static void main(String[]args)
    {
      System.out.println("Enter Number of Studnet in class");
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();        
      Student []s=new Student[n];
      
      for(int i=0;i<s.length;i++)
        {
           int r,m;
           String st;
           System.out.println("Enter roll no,marks and name");
           r=sc.nextInt();
           m=sc.nextInt();
           sc.nextLine();
           st=sc.nextLine();          
           s[i]=new Student(r,st,m);
        }


       Student.ref.getD();
    }
}