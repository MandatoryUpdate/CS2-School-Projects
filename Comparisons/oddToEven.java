import java.util.*;
public class oddToEven
{
   public static void main(String[] args)
   {
       ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
       System.out.println(oddEven(data));
       
       ArrayList<Integer> data2 = new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
       System.out.println(oddEven(data2));
       
       ArrayList<Integer> data3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
       System.out.println(oddEven(data3));
       
       ArrayList<Integer> data4 = new ArrayList<Integer>(Arrays.asList(32767,70,4,5,6,7));
       System.out.println(oddEven(data4));
       
       ArrayList<Integer> data5 = new ArrayList<Integer>(Arrays.asList(2,7,11,21,5,7));
       System.out.println(oddEven(data5));
       
       ArrayList<Integer> data6 = new ArrayList<Integer>(Arrays.asList(7,255,11,255,100,3,2));
       System.out.println(oddEven(data6));
       
       ArrayList<Integer> data7 = new ArrayList<Integer>(Arrays.asList(9,11,11,11,7,1000,3));
       System.out.println(oddEven(data7));
       
       ArrayList<Integer> data8 = new ArrayList<Integer>(Arrays.asList(7,7,7,11,2,7,7,11,11,2));
       System.out.println(oddEven(data8));
       
       ArrayList<Integer> data9 = new ArrayList<Integer>(Arrays.asList(2,4,6,8,8));
       System.out.println(oddEven(data9));
   }
   
   public static Integer oddEven(ArrayList<Integer> a)
   {
       int lastEven = -1;
       int firstOdd = -1;
       for(int i = 0 ; i < a.size() ; i++)
       {
           if(a.get(i) % 2 == 1)
           {
               firstOdd = i;
               break;
           }
       }
       
       if(firstOdd == -1)
       {
           return -1;
       }
       
       for(int i = firstOdd ; i < a.size() ; i++)
       {
           if(a.get(i)%2 == 0)
           {
               lastEven = i;
           }
       }
       
       if(lastEven == -1)
       {
           return -1;
       }
       
       return lastEven - firstOdd;
       
   }
}
