package IDKdude;
class TestShapes {

   public static void main(String[] args) {
      System.out.println("*** Testing a Circle ***");
      Circle roundThing = new Circle("potat", 1, 2, 3);
      System.out.println(roundThing.getName());
      System.out.println(roundThing.calcArea());
      System.out.println(roundThing);   // implicitly uses object's toString()
      
      System.out.println("\n*** Testing a Rectangle ***");
      Rectangle wishIWasASquare = new Rectangle("stocks", 1, 2, 3, 4);
      System.out.println(wishIWasASquare.getName());
      System.out.println(wishIWasASquare.calcArea());
      System.out.println(wishIWasASquare);   // implicitly uses object's toString()
      
      System.out.println("\n*** Testing a Triangle ***");
      Triangle pointyThing = new Triangle("pickle", 1, 2, 3, 4);
      System.out.println(pointyThing.getName());
      System.out.println(pointyThing.calcArea());
      System.out.println(pointyThing);   // implicitly uses object's toString()

   }
   
}