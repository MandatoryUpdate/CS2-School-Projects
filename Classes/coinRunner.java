public class coinRunner
{
    public static void main(String[] args)
    {
        Coin coin = new Coin();
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println(coin.coinFlip());
        }
        
        System.out.println(coin.toString());
    }
}
