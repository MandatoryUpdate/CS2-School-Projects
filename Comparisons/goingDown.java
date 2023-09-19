import java.util.*;
public class goingDown
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345));
       ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
       ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
       ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(32767));
       ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(225, 255));
       ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,1000));
       ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
       ArrayList<Integer> list8 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
       ArrayList<Integer> list9 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
       ArrayList<Integer> list10 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
       ArrayList<Integer> list11 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455));
       ArrayList<Integer> list12 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,1000));
       System.out.println(goingDown(list1));
       System.out.println(goingDown(list2));
       System.out.println(goingDown(list3));
       System.out.println(goingDown(list4));
       System.out.println(goingDown(list5));
       System.out.println(goingDown(list6));
       System.out.println(goingDown(list7));
       System.out.println(goingDown(list8));
       System.out.println(goingDown(list9));
       System.out.println(goingDown(list10));
       System.out.println(goingDown(list11));
       System.out.println(goingDown(list12));
    }
    public static boolean goingDown(ArrayList<Integer> a)
    {
       boolean increase = true;
       if(a.size() < 2)
            return true;
       for(int i = 1 ; i < a.size() ; i++)
       {
           if(a.get(i) >= a.get(i-1))
           {
               increase = false;
           }
       }
       return increase;
    }
}
