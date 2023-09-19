package IDKdude;

public class Rectangle extends Shape {
  private double width, height;
  // If the subclass has no constructor at all, the compiler will automatically create 
  public Rectangle()
  {
      super();
      width=0;
      height=0;
  }
  public Rectangle(String s, int xPos, int yPos, double l, double w)
  {
      super(s, xPos, yPos);
      width = w;
      height = l;
  }
  // a public constructor that calls the default constructor of the superclass.
  public double calcArea()
  {
      return width * height;
  }
   public String toString()
  {
      return super.toString() + " The width is: " + width + " The height is: " + height + " The Area is: " + calcArea();
  }
}