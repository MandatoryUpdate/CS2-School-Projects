package IDKdude;
public class Ball
{
   private String brand;
   private double diameter;
   private String material;
   
   public Ball(){
       brand = "Nike";
       diameter = 12.0;
       material = "plastic";
    }
   
   public Ball(String b, double d, String m){
        brand = b;
        diameter = d;
        material = m;
   }
   
   public void setBrand(String b){
       brand = b;
    }
    
   public String getBrand(){
       return brand;
    }
    
   public String getMaterial(){
       return material;
    }
    
   public String toString(){
       return " this ball is brand = " + brand + " and material = " + material;
    }
}