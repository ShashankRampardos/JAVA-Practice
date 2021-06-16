interface  Constants
{
   public static final short KmToM=1000;
   public static final byte MTCm=100;
   public static final byte CmToMm=10; 
}

class Converter implements Constants
{
   

   public static double KiloToM(double km)
   {
      return km*KmToM;
   }
   public static double MetToCm(double m)
   {
      return m*MTCm;
   }
   public static double CmToMm(double cm)
   {
      return cm*CmToMm;
   }
 
}
public class A6Q1
{
  public static void main(String[]args)
   {
     System.out.println("23km in Meter:"+Converter.KiloToM(23));
     System.out.println("23m in Centimeter Meter:"+Converter.MetToCm(23));
     System.out.println("23cm in Mili Meter:"+Converter.CmToMm(23)); 
   }
}