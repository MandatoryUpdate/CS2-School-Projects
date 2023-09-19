public class Cat
{
    private double height;
    private double weight;
    private int age;
    private String name;
    
    public Cat(){
        height = 1.0;
        weight = 0.001;
        age = 1000;
        name = "Cheese Token";
    }
    
    public Cat(double h, double w, int a, String n){
        height = h;
        weight = w;
        age = a;
        name = n;
    }
    
    public void setWeight(double w){
        weight = w;
    }
    
    public void setAge(int a){
        age = a;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public int getAge(){
        return age;
    }
    
    public void feed(){
        System.out.println("that was a yummy mouse");
    }
    
    public void feed(String food){
        System.out.println("that was a yummy " + food);
    }
            
    public String toString(){
        return String.format("cat name = %s, weight = %.2f, height = %.2f, age = %d",name,weight,height,age);
    }
}