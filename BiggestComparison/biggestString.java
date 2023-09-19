public class biggestString
{
   public static void main(String[] args)
   {
       System.out.println(checkString("abc", "cba", "bca"));
       System.out.println(checkString("one", "fourteen", "twenty"));
       System.out.println(checkString("124323", "20009", "3434"));
       System.out.println(checkString("abcde", "ABCDE", "1234234324"));
   }
   
   public static String checkString(String w1, String w2, String w3)
   {
       System.out.println(w1 + " " + w2+ " " + w3);
       String cheese = "";
       if(w2.compareTo(w1) < 0 && w3.compareTo(w1) < 0)
       {
           cheese = "biggest = " + w1 + "\n";
       }
       else if(w1.compareTo(w3)< 0 && w2.compareTo(w3) < 0)
       {
          cheese = "biggest = " + w3 + "\n";
       }
       else if(w1.compareTo(w2) < 0 && w3.compareTo(w2) < 0)
       {
           cheese = "biggest = " + w2 + "\n"; 
       }
       return cheese;
   }   
}

