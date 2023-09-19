
public class DebugExpressionsC
{
    public static void main(String[] args){
        
        int x = 5;
        int y = 6;
        System.out.println("the average of x and y is: " + average(x,y));
        //answer should be 5.5
        
        double temp = 40.5;
        System.out.println("Celcius temp = " + temp + ", converted to Fahrenheit = " + convertCtoF(temp));
        //answer should  be 104.9
    }
    
    //this method is intended to return the average of two numbers
    public static double average(int numOne, int numTwo){
        return (double)(numOne + numTwo) / 2;
    }
    
    //this method is intended to convert celcius to fahrenheit
    public static double convertCtoF(double celcius){
        double convertFactor = (double)9/5;
        double fahrenheit = celcius * convertFactor + 32;
        return fahrenheit;
    }
}