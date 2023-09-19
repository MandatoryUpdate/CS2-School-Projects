package IDKdude;

public class Volleyball extends Ball
{
    private int spikability;
    
    public Volleyball(){
        super("Wilson",9.0,"cardboard");
        spikability = 10;
    }
    
    public int getSpikability(){
        return spikability;
    }
    
    public String toString(){
        return super.toString() + " and spikability = " + spikability;
    }
}