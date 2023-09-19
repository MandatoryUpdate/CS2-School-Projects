
public class Algorithms
{
    public static void main(String[] args)
    {
        System.out.println(canDivide(16,4));
        System.out.println(canDivide(7,4));
        System.out.println();
        System.out.println(returnSum(125));
        System.out.println();
        System.out.println(countRange(1,10));
        System.out.println();
        int[] nums = {5,10,120,7,8,124,517,1,138,671,680,87};
        System.out.println(giveMin(nums));
        System.out.println();
        System.out.println(returnSum(nums));
        System.out.println();
        System.out.println(returnAverage(nums));
        System.out.println();
        System.out.println(returnVowels("Car", "Cheese", "Stock"));
        System.out.println();
        System.out.println(returnConsonants("Potato PCs exist for consumer use"));
        System.out.println();
        System.out.println(returnReverse("Potato PCs exist for consumer use"));
        System.out.println();
    }
    
    public static boolean canDivide(int numOne, int numTwo)
    {      
        return numOne%numTwo == 0;
    }
    
    public static int returnSum(int num)
    {
        int sum = 0;
        while(num>0)
        {
            sum += num % 10;
            num = num/10;
        }
        return sum;
    }
    
    public static int countRange(int numOne, int numTwo)
    {
        int odds = 0;
        if(numOne > numTwo)
        {
            for(int i = numTwo ; i <= numOne ; i++)
            {
               if(i%2 == 1)
               {
                   odds++;
               }
            }
        }
        else
        {
            for(int i = numOne ; i <= numTwo ; i++)
            {
               if(i%2 == 1)
               {
                   odds++;
               }
            }
        }
        return odds;
    }
    
    public static int giveMin(int[] nums)
    {
        int total = nums[0];
        for(int i = 0 ; i < nums.length; i++)
        {
            if(nums[i] < total)
            {
                total = nums[i];
            }
        }
        return total;
    }
    
    public static int returnSum(int[] nums)
    {
        int total = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            total+= nums[i];
        }
        return total;
    }
    
    public static double returnAverage(int[] nums)
    {
        double total = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            total+= nums[i];
        }
        total= total/nums.length;
        total = Math.round(total * 100.0) / 100.0;
        return total;
    }
    
    public static String returnVowels(String word1, String word2, String word3)
    {
        String vowels = "aeiouAEIOU";
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0 ; i < word1.length() ; i++)
        {
            for(int j = 0 ; j < vowels.length() ; j++)
            {
                if(vowels.substring(j,j+1).equals(word1.substring(i,i+1)))
                {
                    a++;
                }
            }
        }
        for(int i = 0 ; i < word2.length() ; i++)
        {
            for(int j = 0 ; j < vowels.length() ; j++)
            {
                if(vowels.substring(j,j+1).equals(word2.substring(i,i+1)))
                {
                    b++;
                }
            }
        }
        for(int i = 0 ; i < word3.length() ; i++)
        {
            for(int j = 0 ; j < vowels.length() ; j++)
            {
                if(vowels.substring(j,j+1).equals(word3.substring(i,i+1)))
                {
                    c++;
                }
            }
        }
        int[] array = {a,b,c};
        int count = 0;
        for(int i = 0; i < array.length ; i++)
        {
            if(array[i] > 0)
            {
                count++;
            }
        }
        return count + " strings have vowels";
    }
    public static String returnConsonants(String word1)
    {
        String vowels = "aeiouAEIOU";
        int total = 0;
        for(int i = 0 ; i < word1.length() ; i++)
        {
            if(!(vowels.indexOf(word1.substring(i,i+1))>=0))
            {
                total++;
            }
        }
        
        return "A total of " + total + " consonants";
    }
    public static String returnReverse(String word1)
    {
        String reverse = "";
        for(int i = word1.length()-1 ; i >= 0 ; i--)
        {
            reverse = reverse += word1.substring(i,i+1);
        }
        return reverse;
    }
}
