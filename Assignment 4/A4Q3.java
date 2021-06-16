import java.util.Scanner;
public class A4Q3
{
   public static void main(String[]args)
   {
      Scanner s=new Scanner(System.in);
    System.out.println("Enter number of Branches in MySirG Academy:");
     int br=s.nextInt();
    
int [][]My;
My=new int[br][];
    for(int i=0;i<br;i++)
      {
        
       System.out.println("Enter number of Courses in Branch "+(i+1)+":");
       int cr=s.nextInt();
       My[i]=new int[cr];      
      }
     
    for(int i=0;i<My.length;i++)
      {
         System.out.println("Branch "+(i+1));
        for(int j=0;j<My[i].length;j++)
          {
             System.out.println("Enter no of Students in course "+(j+1)+" of branch "+(i+1));
             My[i][j]=s.nextInt();   
          }
      } 
      for(int []a:My)
       {  int sum=00;
          int i=1; 
         for(int x:a)
          {
            sum=sum+x; 
          }
         System.out.println("Total Students in Branch "+i+":"+sum);
       i++;
       }
   }
}