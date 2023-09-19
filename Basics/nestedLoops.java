
public class nestedLoops
{
    public static void main(String[] args)
    {
        String[] letters = {"A","X","R","T","W"};
        int[] numbers = {3,7,1,5,4};
        for(int i = 0 ; i <= letters.length - 1 ; i++)
        {
            System.out.println(triangleOne(letters[i], numbers[i]));
        }
        System.out.println();
        for(int i = 0 ; i <= letters.length - 1 ; i++)
        {
            System.out.println(triangleThree(letters[i], numbers[i]));
        }
        System.out.println();
        String[] words = {"SQUARE", "BOX", "A", "IT", "TOAD"};
        for(int i = 0 ; i <= words.length - 1 ; i++)
        {
            System.out.println(boxWord(words[i]));
        }
        System.out.println();
        String[] letters2 = {"C", "A", "B", "X", "Z"};
        int[] numbers2 = {4, 5, 7, 6, 8};
        for(int i = 0 ; i <= words.length - 1 ; i++)
        {
            System.out.println(triangleFive(numbers2[i], letters2[i]));
        }
    }
    
    public static String triangleOne(String letter, int num)
    {
        String output = "";
        for(int i = 0 ; i < num ; i ++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                output +=letter;
            }
            output = output + "\n";
        }
        return output;
    }
    
    public static String triangleThree(String letter, int num)
    {
        String output = "";
        for(int i = 0 ; i <= num ; i++)
        {
            for(int j = num - i ; j > 0 ; j--)
            {
                output+=" ";
            }
            for(int k = 0 ; k < i ; k++)
            {
                output+=letter;
            }
            output+="\n";
        }
        return output;
    }
    public static String boxWord(String word)
    {
        String output = word + "\n";
        String reverse = "";
        for(int i = word.length() ; i >=1 ; i--)
        {
            reverse = reverse.substring(0, reverse.length()) + word.substring(i-1,i);
        }
        
        int x = word.length();
        for(int i = 1 ; i <=x-2 ; i ++)
        {
            output = output + word.substring(i, i + 1);
            for(int k = x - 2 ; k > 0 ; k--)
            {
                output = output + " ";
            }
            output = output + reverse.substring(i, i+1);
            output = output + "\n";
        }
        if(word.length() > 1)
        {
            return output + reverse + "\n";
        }
        else
            return output;
    }
    public static String triangleFive(int num, String letter)
    {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int a = alpha.indexOf(letter);
        String output = "";
        for(int k = 0 ; k < num ; k++)
        {
            for(int i = 0 ; i < num - k ; i++)
            {
                for(int j = num ; j > i ; j--)
                {
                    output = output + alpha.substring((a+i)%26, (a+i)%26 + 1);
                }
                output = output + " ";
            }
            output = output + "\n";
        }
        return output;
    }
}
