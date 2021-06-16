interface Shape
{
  public double getArea();
  public String getName();
}

class Circle extends A implements Shape
{
   private double r;
   Circle(double d)
    {r=d;}
  public double getArea()
   {
     return 3.14*r*r;
   }
  public String getName()
   {
      return "Circle";    
   }  
}
class Rectangle implements Shape
{
   private double l,b,h;
   Rectangle(double l,double b,double h)
    {this.l=l;
     this.b=b;
     this.h=h;
    }
  public double getArea()
   {
     return l*b*h;
   }
  public String getName()
   {
      return "Rectangle";    
   }  
}
class Square implements Shape
{
   private double s;
   Square(double d)
    {s=d;}
  public double getArea()
   {
     return s*s;
   }
  public String getName()
   {
      return "Square";    
   }  
}
public class A6Q2
{
   public static void main(String[]args)
     {
       Shape[]s=new Shape[3];
       s[0]=new Circle(5);
       s[1]=new Rectangle(5,3,6);
       s[2]=new Square(5);
       for(Shape x:s)
       {
       System.out.println(x.getName()); 
       System.out.println(x.getArea());   
       }
       
         
     }
}