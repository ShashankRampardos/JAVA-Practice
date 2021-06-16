abstract class Apartment
{ 
  
  double totalArea; 
  public double getBedRoom1Area(double length,double width)
    {
       totalArea=totalArea+length*width;      
       return length*width;
    }
  public abstract double getBedRoom2Area(double length,double width);
  public abstract double getBedRoom3Area(double length,double width);  
  public double getKitchenArea(double length,double width)
   { 
     totalArea=totalArea+length*width;      
     return length*width;
   }
  public double getHallArea(double length,double width)
   { 
      totalArea=totalArea+length*width;      
      return length*width;
   }

public abstract double getTotalArea();
}

class OneBhk extends Apartment
{
  
  
  public double getBedRoom2Area(double length,double width)
   {
     return 0;
   }
  public double getBedRoom3Area(double length,double width)
   {
     return 0;
   }
  public double getTotalArea()
    {
      System.out.println("BedroomArea:"+getBedRoom1Area(40.0,20.0));
      System.out.println("BedroomArea:"+getKitchenArea(30.0,10.0));
      System.out.println("BedroomArea:"+getHallArea(40.0,50.0)); 
      return totalArea;
    }
    
}
class TwoBhk extends Apartment
{
  
  
  public double getBedRoom2Area(double length,double width)
   {
     totalArea=totalArea+length*width;
     return length*width;
   }
   public double getBedRoom3Area(double length,double width)
   {
     return 0;
   }
  public double getTotalArea()
    {
      System.out.println("BedroomArea:"+getBedRoom1Area(40.0,20.0));
      System.out.println("BedroomArea:"+getBedRoom2Area(40.0,20.0));
      System.out.println("BedroomArea:"+getKitchenArea(30.0,10.0));
      System.out.println("BedroomArea:"+getHallArea(40.0,50.0));
      return totalArea;
    }
    
}
class ThreeBhk extends Apartment
{
  
  
  public double getBedRoom2Area(double length,double width)
   {
     totalArea=totalArea+length*width;
     return length*width;
   }
  public double getBedRoom3Area(double length,double width)
   {
     totalArea=totalArea+length*width;
     return length*width;
   }
  public double getTotalArea()
    {
      System.out.println("BedroomArea:"+getBedRoom1Area(40.0,20.0));
      System.out.println("BedroomArea:"+getBedRoom2Area(40.0,20.0));
      System.out.println("BedroomArea:"+getBedRoom3Area(40.0,20.0));
      System.out.println("BedroomArea:"+getKitchenArea(30.0,10.0));
      System.out.println("BedroomArea:"+getHallArea(40,50));
      return totalArea;
    }
    
}


public class A6Q4
{
   public static void main(String[]args)
     {
        Apartment[]a=new Apartment[3];
        a[0]=new OneBhk();
        a[1]=new TwoBhk();
        a[2]=new ThreeBhk();
   for(Apartment x:a)
   {
     System.out.println(x.getTotalArea());
    
   }     
       
     }
}


