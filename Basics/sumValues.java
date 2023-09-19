import java.util.*;


public class sumValues
{
    public static void main(String[] args)
    {
        ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
        System.out.println(count(data));
        
        ArrayList<Integer> data2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
        System.out.println(count(data2));
        
        ArrayList<Integer> data3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
        System.out.println(count(data3));
        
        ArrayList<Integer> data4 = new ArrayList<Integer>(Arrays.asList(32767));
        System.out.println(count(data4));
        
        ArrayList<Integer> data5 = new ArrayList<Integer>(Arrays.asList(255,255));
        System.out.println(count(data5));
        
        ArrayList<Integer> data6 = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,2));
        System.out.println(count(data6));
        
        ArrayList<Integer> data7 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
        System.out.println(count(data7));
        
        ArrayList<Integer> data8 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,1));
        System.out.println(count(data8));
        
        ArrayList<Integer> data9 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6));
        System.out.println(count(data9));
        
        ArrayList<Integer> data10 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
        System.out.println(count(data10));
        
        ArrayList<Integer> data11 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
        System.out.println(count(data11));
        
        ArrayList<Integer> data12 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,-3000));
        System.out.println(count(data12));
    }
    
    public static Integer count(ArrayList<Integer> a)
    {
        int total = 0;
        for(int i = 0 ; i < a.size() ; i++)
        {
            if(a.get(i) > a.get(0))
            {
                total += a.get(i);
            }
        }
        if(total == 0)
        {
            return -1;
        }
        return total;
    }
}
