public class leapYear
{
    public static void main(String[] args)
    {
        System.out.println(checkLeap(1253));
        System.out.println(checkLeap(209));
        System.out.println(checkLeap(2131));
        System.out.println(checkLeap(400));
        System.out.println(checkLeap(4000));
        System.out.println(checkLeap(1500));
        System.out.println(checkLeap(1600));
    }
    
    public static String checkLeap(int year)
    {
        System.out.println("Enter a year :: " + year);
        String isOrNot = "";
        if(year%400 == 0 || !(year%100 == 0) && year%4 == 0)
        {
            isOrNot = year + " is a leap year" + "\n";
        }
        else
        {
            isOrNot = year + " is NOT a leap year" + "\n";
        }
        return isOrNot;
    }
}
