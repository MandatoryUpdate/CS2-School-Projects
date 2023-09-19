
public class CatRunner
{
    public static void main(String[] args)
    {
        Cat catOne = new Cat();
        
        double height = 0.01;
        double weight = 500.5;
        int age = 100;
        String name = "Milk Toast";
        Cat catTwo = new Cat(height, weight, age, name);
        
        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println();
        
        String totalAgeS = "total age = ";
        System.out.println(totalAgeS + (catOne.getAge() + catTwo.getAge()));
        System.out.println();
        
        String totalWeightS= "total weight = " ;
        System.out.println(totalWeightS + (catOne.getWeight() + catTwo.getWeight()));
        System.out.println();
        
        catOne.setWeight(999.999);
        catTwo.setWeight(109248.1);
        System.out.println();
        
        System.out.println(totalWeightS + (catOne.getWeight() + catTwo.getWeight())); 
        System.out.println();
        
        catOne.feed();
        catTwo.feed("chocolate");
    }
}
