public class debtRunner
{
    public static void main(String[] args)
    {
        Debts person1 = new Debts();
        Debts person2 = new Debts(150000, "Sally Goodfeather", "Chicken Stock Lane");
        Debts person3 = new Debts("String Bean Baloney", "Stick Resin Road");
        
        Debts[] peoples = {person1, person2, person3};
        
        for(int i = 0 ; i < peoples.length ; i++)
        {
            System.out.println(peoples[i]);
        }
        
        for(int i = 0 ; i < peoples.length ; i++)
        {
            System.out.print(peoples[i].getName() + " ");
            System.out.print(peoples[i].getAddress() + " ");
            System.out.println(peoples[i].getMoneyOwed() + "\n");
        }
        
        person1.setName("Biscotti");
        person2.setAddress("123 17th Biscuit Lane");
        person3.setMoneyOwed(125);
        
        System.out.println();
        for(int i = 0 ; i < peoples.length ; i++)
        {
            System.out.print(peoples[i].getName() + " ");
            System.out.print(peoples[i].getAddress() + " ");
            System.out.println(peoples[i].getMoneyOwed() + "\n");
        }
        
        for(int i = 0 ; i < peoples.length ; i++)
        {
            System.out.print(peoples[i].debtSize());
        }
    }
}
