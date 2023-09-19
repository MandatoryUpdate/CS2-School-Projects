package asdasdasd;
import java.util.ArrayList;
import java.util.Arrays;

public class BallRunner
{
    public static void main(String[] args){
        
        Ball b = new SoccerBall();
        Ball v = new Volleyball();
        
        ArrayList<Ball> listy = new ArrayList<Ball>(Arrays.asList(b,v));
        
        System.out.println(listy);
        
        System.out.println(b.getBrand());
        
        System.out.println(v);
    }
}