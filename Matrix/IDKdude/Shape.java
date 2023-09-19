package IDKdude;
public class Shape {
   private String name;
   private int x, y;
   
   // default constructor
   public Shape() {
      name = "GeometricShape";
      x = 0;
      y = 0;
   }
   
   // initialization constructor
   public Shape(String shapeName, int xPos, int yPos) { 
      name = shapeName;
      x = xPos; 
      y = yPos;
   }

   // accessors/getters & modifiers/setters
   public String getName() { 
      return name;
   }
      
   public int getX() { 
      return x;
   }
   
   public int getY() { 
      return y;
   }
   
   public void setName(String shapeName) {
      name = shapeName;
   }
      
   public void setX(int xPos) { 
      x = xPos;
   }
   
   public void setY(int yPos) { 
      y = yPos;
   }
   
   // methods
   public double calcArea() {   // all subclasses will override
     System.out.println("We need a UNIQUE method for each shape.");
     return 0;
   }

   public String toString() { 
      return "The " + name + " is located at (" + x + "," + y + ")";
   }
}