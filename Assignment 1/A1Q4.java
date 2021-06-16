public class A1Q4
{
  public static void main(String[]arr)
  {
     byte s1=Byte.parseByte(arr[0]);
     byte s2=Byte.parseByte(arr[1]);
     byte s3=Byte.parseByte(arr[2]);
     byte s4=Byte.parseByte(arr[3]);
byte count=s1<(byte)35?s2<(byte)35?s3<(byte)35?s4<(byte)35?(byte)4:(byte)3:(byte)2:(byte)1:(byte)0;
boolean b=count>0?false:true;    
String st=count>1?" Subjects":" Subject";
  if(b){
   short total=(short)(s1+s2+s3+s4);
   float percent=(float)(total/400.0*100);
   System.out.println("Total marks is "+total+"\n"+"Percentage is "+percent+"%");
    }
else
    System.out.println("Student is fail in "+count+st);
  
   }
}