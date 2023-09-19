public class Debts
{
    private int moneyOwed;
    private static int numPeople;
    private String name;
    private String address;
    
    public Debts()
    {
        moneyOwed = 100;
        name = "Boutique";
        address = "Drury Lane";
        numPeople++;
    }
    
    public Debts(int mO, String n, String a)
    {
        moneyOwed = mO;
        name = n;
        address = a;
        numPeople++;
    }
    
    public Debts(String n, String a)
    {
        name = n;
        address = a;
        moneyOwed = 100;
    }
    
    //Edit Static method
    public static void payDebt()
    {
        numPeople--;
    }
    
    //Getters
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public int getMoneyOwed()
    {
        return moneyOwed;
    }
    
    public static int returnNumPeople()
    {
        return numPeople;
    }
    
    //Setters
    public void setName(String n)
    {
        System.out.println(name + " has changed their name to  " + n);
        name = n;
        
    }
    
    public void setAddress(String a)
    {
        address = a;
        System.out.println(name + "has moved to " + address);
    }
    
    public void setMoneyOwed(int mO)
    {
        if(mO < moneyOwed)
        {
            System.out.println(name + " has lessened their debts to " + mO);
        }
        else
        {
            System.out.println(name + " has increased their debts to " + mO);
        }
        moneyOwed = mO;
       
    }
    
    //other methods
    public String debtSize()
    {
        double debt = moneyOwed + (double)moneyOwed * 1.07;
        if(moneyOwed <= 100)
        {
            return name + ", you have no interest, for now...\n";
        }
        else
            moneyOwed += (int)debt;
        return name + " we've raised your debt by " + debt + " dollars. Pay it off now or we'll break your legs." + "\n";
    }
    
    //toString
    public String toString()
    {
        if(moneyOwed == 0)
            return name + " doesn't owe us any money. They're safe for now. \n";
        return name + " owes us " + moneyOwed + ". They live at " + address + ". give them a \"friendly\" reminder.\n";
    }
}
