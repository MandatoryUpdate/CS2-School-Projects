import java.util.*;
public class listTotalValues
{
    public static void main(String[] args)
    {
        ArrayList<Integer> data1 = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345));
        System.out.println(addAll(data1));
        
        ArrayList<Integer> data2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
        System.out.println(addAll(data2));
        
        ArrayList<Integer> data3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
        System.out.println(addAll(data3));
        
        ArrayList<Integer> data4 = new ArrayList<Integer>(Arrays.asList(32767));
        System.out.println(addAll(data4));
        
        ArrayList<Integer> data5 = new ArrayList<Integer>(Arrays.asList(255,255));
        System.out.println(addAll(data5));
        
        ArrayList<Integer> data6 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
        System.out.println(addAll(data6));
        
        ArrayList<Integer> data7 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
        System.out.println(addAll(data7));
        
        ArrayList<Integer> data8 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
        System.out.println(addAll(data8));
        
        ArrayList<Integer> data9 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
        System.out.println(addAll(data9));
        
        ArrayList<Integer> data10 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455));
        System.out.println(addAll(data10));
        
        ArrayList<Integer> data11 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,1000));
        System.out.println(addAll(data11));
    }
    
    public static Integer addAll(ArrayList<Integer> a)
    {
        int total = 0;
        for(int i : a)
        {
            total+=i;
        }
        return total;
    }
}
