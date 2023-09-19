
public class stringPractice
{
   public static void main(String[] args)
   {
       String[] word = {"dog", "cats", "aplus", "pigs", "catgiraffe", "apluscompsci", "ap", "aplus", "pluscat", "dogsaplus", "#", "#", "aplusdog#13337#", "pigaplusprogram", "code", "code1234", "plus", "wow", "catsand", "aplusdogsaplus", "7", "77777"};
       //Function for Switch First
       for(int i = 0; i<(word.length - 1); i+=2)
       {
           int word1 = i;
           int word2 = word1 + 1;
           System.out.println(switchFirst(word[word1], word[word2]));
       }
       
       System.out.println();
       //Function for Leave Out Letter
       String[] word2 = {"dog", "aplus", "catgiraffe", "ap", "pluscat", "aplusdog#13337#", "code", "wow", "catsand"};
       int[] num = {1, 2, 3, 1, 4, 9, 2, 1, 0};
       for(int i = 0; i<(word2.length); i++)
       {
          int place = i;
          System.out.println(leaveOutLetter(word2[place], num[place]));
       }
   }
   
   public static String switchFirst(String str1, String str2)
   {
       return str2.substring(0,1) + str1.substring(1);
   }
   
   public static String leaveOutLetter(String str, int nmbr)
   {
       return str.substring(0, nmbr) + str.substring(nmbr+1);
   }
}
