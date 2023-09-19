
public class Coin
{
   private int numHeads;
   private String headsTails;
   
   public Coin()
   {
       numHeads = 0;
       headsTails = "Tails";
   }
   
   public Coin(int nH, String hT)
   {
       numHeads = nH;
       headsTails = hT;
    }
  
    public int getNumHeads()
   {
       return numHeads;
   }
   
   public String getHeadsTails()
   {
       return headsTails;
   }
   
   public void setNumHeads(int nH)
   {
    numHeads = nH;   
   }
   
   public void setHeadsTails(int nT)
   {
    numHeads = nT;   
   }
   
   public String coinFlip()
   {
       if(Math.random() < 0.5)
       {
           headsTails = "Tails";
       }
       else
       {
           headsTails = "Heads";
           numHeads++;
       }
       return "coin facing up is: " + headsTails;
   }
   public String toString()
   {
       return "the total number of heads was: " + numHeads;
   }
}
