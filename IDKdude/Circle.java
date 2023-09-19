package IDKdude;
public class Circle extends Shape {
  private double radius;
  // If the subclass has no constructor at all, the compiler will automatically create 
  // a public constructor that calls the default constructor of the superclass.
  public Circle()
  {
      super();
      radius=0;
  }
  public Circle(String s, int xPos, int yPos, double r)
  {
      super(s, xPos, yPos);
      radius = r;
  }
  public double calcArea()
  {
      return Math.PI * radius * radius;
  }
  
  public String toString()
  {
      return super.toString() + " The radius is: " + radius + " The Area is: " + calcArea();
  }
}