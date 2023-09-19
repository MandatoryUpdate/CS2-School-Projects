public class bigOrSmall
{
    public static void main(String[] args)
    {
        System.out.println(check(10, 20));
        System.out.println(check(20, 10));
        System.out.println(check(20, 20));
        System.out.println(check(10, 10));
        System.out.println(check(0, 1));
        System.out.println(check(1, 0));
        System.out.println(check(3, 5));
        System.out.println(check(5, 3));
        System.out.println(check(55342, 323));
    }
    
    public static String check(int num1, int num2)
    {
        if(num1 > num2 && num1%2 == 1)
            return "yes";
        else if(num2 > num1 && num2%2 == 1)
            return "no";
        else if(num1 == num2 && num1%2 == 0 && num2%2 == 0)
            return "aplus";
        else
            return "compsci";
    }
}
