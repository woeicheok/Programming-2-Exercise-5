import java.util.*;
public class Ex5_Task2_TriangleDemo
{
   public static void main(String[] args)
   {
      
      Scanner console = new Scanner(System.in);
      
      Triangle triangle = new Triangle();
                      
      System.out.print("Enter value for Height: ");
	   double height=console.nextDouble();
	   System.out.print("Enter value for Base: ");
	   double base=console.nextDouble();
       
      triangle.set(height,base);
      
      System.out.println("The pyramid's height is "+triangle.getHeight());
      System.out.println("The pyramid's base is "+triangle.getBase());      
      System.out.println("The pyramid's area is "+triangle.getArea());
      
   }
}

 
class Triangle
{
     private double height;
     private double base;

     public void setHeight(double len)
     {
          height = len;
     } 
    
     public void setBase(double b)
     {
          base = b;
     }
  
     public void set(double len, double b)
     {
          height = len;
          base = b;
     }

     public double getHeight()
     {
          return height;
     }

     public double getBase()
     {
          return base;
     }

     public double getArea()
     {
          return 0.5 * height * base;
     }
}
