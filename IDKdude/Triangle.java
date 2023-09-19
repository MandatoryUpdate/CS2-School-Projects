package IDKdude;
public class Triangle extends Shape {
  public double base, height;
  // If the subclass has no constructor at all, the compiler will automatically create 
  public Triangle()
  {
      super();
      base=0;
      height=0;
  }
  public Triangle(String s, int xPos, int yPos, double b, double w)
  {
      super(s, xPos, yPos);
      base = b;
      height = w;
  }
  // a public constructor that calls the default constructor of the superclass.
  public double calcArea()
  {
      return 0.5 * base * height;
  }
   public String toString()
  {
      return super.toString() + " The base is: " + base + " The height is: " + height + " The Area is: " + calcArea();
  }
}