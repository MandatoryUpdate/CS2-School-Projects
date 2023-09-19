public class numberOrVowel
{
    public static void main(String[] args)
    {
        String[] sampleData = {"apluscompsci", "1fortthemoney", "chicken99", "funkycoldsnow", "APLUSCOMPSCI", "77sodacans99", "aardvark", "cancancancan"};
        
        for(int i = 0 ; i <=sampleData.length-1 ; i++)
        {
            System.out.println(checkLetter(sampleData[i]));
        }
    }
    
    public static boolean checkLetter(String word)
    {
        String good = "aeiou0123456789AEIOU";
        if(good.indexOf(word.substring(0,1))>=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
