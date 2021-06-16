public class A1Q5
{
  public static void main(String[]arr)
  {
    System.out.println("Enter a two digit number");
    short year=Short.parseShort(arr[0]);
  if (year%4==0)
   System.out.println("Year is a leap year");
  else
   System.out.println("Year is not a leap year");  

  }
}