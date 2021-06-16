//koi number 3 bar se jada repete ho raha ha to Array index out on bound
import java.util.Scanner;
public class A3Q1
{
   public static void main(String[]args)
     {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of array:");

        short n=s.nextShort();
        int []a=new int[n];

        System.out.println("Enter array Values:");

        for(short i=0;i<a.length;i++)
          a[i]=s.nextInt();

        short k=1;
        int ele=a[0];

        int []count1=new int[2];//[0]th will store number and [1]th will store frequency of that number

       short count2;
       boolean innerloopGate=false;

       L1:for(short i=0;i<a.length;i++)
       { count2=1;//will count each num in array

         if(innerloopGate)
          if(a[i]!=ele)
            ele=a[i];
          else
            continue;


          L2:for(short j=(short)(i+1);j<a.length;j++)
            { innerloopGate=true;
               if(j>=a.length)
                continue L1;
               System.out.println("\nj="+j);
              if(ele==a[j])
                {
                   a[j]=a[j]+a[k];
                   a[k]=a[j]-a[k];
                   a[j]=a[j]-a[k];
                 count2++;
                   k++;


                }

            }System.out.println("\nc="+count2);
              if(count1[1]<count2){
                    count1[1]=count2;
                    count1[0]=ele;
                     }

       }

         if(count1[1]==1)
            System.out.println("Maximum Highest Frequency is 1");
         else
            System.out.println("Highest Frequency:"+count1[1]+"\nNumber:"+count1[0]);
     }
}
/*do nothing continue L2; cannot use label before its declaration
          if(a[0]==a[1])
           count2=0; //just to write somethint, if will true will only be true one time
          else{*/


