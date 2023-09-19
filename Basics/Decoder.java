public class Decoder
{
    public static void main(String[] args)
    {
        String[] sampleData = {"a", "A", "b", "0", "T", "*", "H", "T"};
        
        for(int i = 0 ; i<=sampleData.length-1 ; i++)
        {
            System.out.println(decode(sampleData[i]) + "\n");
        }
    }
    
    public static String decode(String sample)
    {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String something = sample;
        if(upper.indexOf(something) >= 0)
        {
            something = something.toLowerCase();
        }
        else if(lower.indexOf(something) >= 0)
        {
            something = something.toUpperCase();
        }
        else if(number.indexOf(something) >= 0)
        {
            something = upper.substring(number.indexOf(something), number.indexOf(something) + 1);
        }
        else
        {
            something = " #";
        }
        return "Enter a letter :: " + sample + "\n" + sample + " decodes to " + something;
    }
}
