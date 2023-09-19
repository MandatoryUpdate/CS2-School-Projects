public class biggestDouble
{
   public static void main(String[] args)
   {
       System.out.println(checkDouble(4.5, 6.7, 7.8, 9.0));
       System.out.println(checkDouble(14.51, 6.17, 71.8, 1.0));
       System.out.println(checkDouble(41.15, 816.7, 17.8, 19.0));
       System.out.println(checkDouble(884.5, 16.7, 7.8, 9.0));
       System.out.println(checkDouble(4.5, -456.7, 677.8, 9.0));
       System.out.println(checkDouble(4.5, 16.7, -7.8, -9.0));
   }
   
   public static String checkDouble(double num1, double num2, double num3, double num4)
   {
       String beans = "";
       System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
       if(num1 > num2 && num1 > num3 && num1 > num4)
       {
           beans = "biggest = " + num1 + "\n";
       }
       else if(num2 > num1 && num2 > num3 && num2 > num4)
       {
           beans = "biggest = " + num2 + "\n";
       }
       else if(num3 > num1 && num3 > num2 && num3 > num4)
       {
           beans = "biggest = " + num3 + "\n";
       }
       else if(num4 > num1 && num4 > num3 && num4 > num2)
       {
           beans = "biggest = " + num4 + "\n";
       }
       return beans;
   }
}
