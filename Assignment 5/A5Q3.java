import java.util.Scanner;

public class A5Q3
{
   public static void main(String[]args)
      {
        Scanner s=new Scanner(System.in);
        
        int [][]ar=new int[12][];
        
        for(int i=0;i<ar.length;i++)
         {
            if(i==0)
           System.out.println("Enter number of Grocery of First month");
            else
           System.out.println("Enter number of Grocery of Next month");
           int n=s.nextInt();
           ar[i]=new int[n];
           System.out.println("Enter Amount for "+n+" groceries respectively.");                   
               for(int j=0;j<ar[i].length;j++)
                 {
                  ar[i][j]=s.nextInt(); 
                 }
         }
 int max=0;
int month=0;
           for(int i=0;i<ar.length;i++)
            {   int sum=0;
                for(int j=0;j<ar[i].length;j++)
                  {
                       sum=ar[i][j]+sum;
                  }
               if(max<sum){
                 max=sum;
                 month=(int)(i+1);
                 }     
            }
          switch(month)
           {
             case 1:
              System.out.println("Max item:"+max+" in January");
               break;
             case 2:
              System.out.println("Max item:"+max+" in Febuarary");
               break;
             case 3:
              System.out.println("Max item:"+max+" in March");
               break;
             case 4:
              System.out.println("Max item:"+max+" in April");
               break;
             case 5:
              System.out.println("Max item:"+max+" in May");
               break;
             case 6:
              System.out.println("Max item:"+max+" in June");
               break;
             case 7:
              System.out.println("Max item:"+max+" in July");
               break;
             case 8:
              System.out.println("Max item:"+max+" in August");
               break;
             case 9:
              System.out.println("Max item:"+max+" in September");
               break;
             case 10:
              System.out.println("Max item:"+max+" in October");
               break;
             case 11:
              System.out.println("Max item:"+max+" in November");
               break;
             case 12:
              System.out.println("Max item:"+max+" in December");              
               break;
           }
      }
}