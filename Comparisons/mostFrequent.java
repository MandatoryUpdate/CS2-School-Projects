import java.util.*;
public class mostFrequent
{
    public static void main(String[] args)
    {
       ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5));
       ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
       ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,10,10,40,30,20,10));
       ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(32767));
       ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(225, 255));
       ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,1000));
       ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456,10,10,2,2,2,2,2,2,2));
       ArrayList<Integer> list8 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
       ArrayList<Integer> list9 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
       ArrayList<Integer> list10 = new ArrayList<Integer>(Arrays.asList(12,12,15,18,21,23,1000));
       ArrayList<Integer> list11 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1));
       ArrayList<Integer> list12 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,1000));
       System.out.println(mostFrequent(list1));
       System.out.println(mostFrequent(list2));
       System.out.println(mostFrequent(list3));
       System.out.println(mostFrequent(list4));
       System.out.println(mostFrequent(list5));
       System.out.println(mostFrequent(list6));
       System.out.println(mostFrequent(list7));
       System.out.println(mostFrequent(list8));
       System.out.println(mostFrequent(list9));
       System.out.println(mostFrequent(list10));
       System.out.println(mostFrequent(list11));
       System.out.println(mostFrequent(list12));    
    }
    public static Integer mostFrequent(ArrayList<Integer> a)
    {
        int frequent = 0;
        int amount = 0;
        int tempAmount = 0;
        if(a.size() < 2)
            return a.get(0);
        for(int i = 0 ; i < a.size() ; i++)
        {
            for(int j = i ; j < a.size() ; j++)
            {
                if(a.get(i) == a.get(j))
                {
                    tempAmount++;
                }
                
                if(tempAmount > amount)
                {
                    frequent = a.get(i);
                    amount = tempAmount;
                }
            }
            
            tempAmount = 0;
        }
        return frequent;
    }
}
