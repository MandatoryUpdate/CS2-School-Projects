public class CompoundAssignment
{
    public static void main(String[] args){
    
        // do each of the following expressions using compound assignment
        
        int x = 5;
        int y = 5;
        
        //rewrite int x = x + 1 to a compound assignment
        x = x+=1;
        
        //rewrite int x = x - 1 to a compound assignment
        x = x -= 1;
        
        //rewrite int y = y * 5 to a compound assignment
        y = y *= 5;
        
        //rewrite int y = y / 5 to a compound assignment
        y = y /= 5;
        
        //rewrite int y = y % 5 to a compound assignment
        y = y %= 2;
        
    }
}

