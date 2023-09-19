
public class practiceWithMethods11
{
    public static void main(String[] args)
    {
        double[] sampleData = {7.5,10,72.534,55,101,99.952};
        for(int i = 0; i< sampleData.length;i++)
        {
            System.out.println(getArea(sampleData[i]));
        }
        
        System.out.println();
        
        int num1, num2, num3;
        int[] sampleData2 = {45, 0, 32, 96, 1, 43, 100, 2, 25, 50, 2, 25, 10, 10,19, 100, 50, 77};
        for(int i = 0; i < sampleData2.length; i+=3)
        {
            num1 = i;
            num2 = num1 + 1;
            num3 = num2 + 1;
            System.out.println(Speed(sampleData2[num1], sampleData2[num2], sampleData2[num3]));
        }
    }
    
    public static String getArea(double value)
    {
        double area = Math.pow(value, 2.0) * Math.PI;
        return String.format("Circle area is :: %.2f", area);
    }
    
    public static String Speed(int val1, int val2, int val3)    
    {
        double time = val2 + ((double)val3/60);
        double speed = val1/time;
        return String.format("%d %d %d = %.0f MPH", val1, val2, val3, speed);
    }
}
