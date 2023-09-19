import java.util.*;
public class noRepeats
{
    public static void main(String[] args)
    {
        ArrayList<Integer> data1 = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5));
        System.out.println(checkRepeats(data1));
        
        ArrayList<Integer> data2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
        System.out.println(checkRepeats(data2));
        
        ArrayList<Integer> data3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,10,10,40,30,20,10));
        System.out.println(checkRepeats(data3));
        
        ArrayList<Integer> data4 = new ArrayList<Integer>(Arrays.asList(32767));
        System.out.println(checkRepeats(data4));
        
        ArrayList<Integer> data5 = new ArrayList<Integer>(Arrays.asList(255,255));
        System.out.println(checkRepeats(data5));
        
        ArrayList<Integer> data6 = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,1000));
        System.out.println(checkRepeats(data6));
        
        ArrayList<Integer> data7 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456,10,10,2,2,2,2,2,2,2));
        System.out.println(checkRepeats(data7));
        
        ArrayList<Integer> data8 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
        System.out.println(checkRepeats(data8));
        
        ArrayList<Integer> data9 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
        System.out.println(checkRepeats(data9));
        
        ArrayList<Integer> data10 = new ArrayList<Integer>(Arrays.asList(12,12,15,18,21,23,1000));
        System.out.println(checkRepeats(data10));
        
        ArrayList<Integer> data11 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1));
        System.out.println(checkRepeats(data11));
        
        ArrayList<Integer> data12 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,1000));
        System.out.println(checkRepeats(data12));
    }
    
    public static boolean checkRepeats(ArrayList<Integer> a)
    {
        int amount = 0;
        int tempAmount = 0;
        for(int i = 0 ; i < a.size() ; i++)
        {
            for(int j = 0 ; j < a.size() ; j++)
            {
                if(a.get(i) == a.get(j))
                {
                    tempAmount++;
                }
            }
            if(tempAmount > 1)
            {
                amount++;
            }
            tempAmount=0;
        }
        if(amount > 0)
            return false;
        return true;
    }
}
