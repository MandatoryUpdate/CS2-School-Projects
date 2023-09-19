//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.*;
public class FancyWord
{
	private String[][] mat;

   public FancyWord(String s)
	{
		//size the matrix
		mat = new String[s.length()][s.length()];

		//use Arrays.fill() to fill in the matrix with spaces
		for(String[] i : mat)
		{
		    Arrays.fill(i, " ");
		}

		//use a for loop to load in the letters into the matrix
		for(int i = 0; i < s.length(); i++)
		{
		    mat[0][i] = s.substring( i , i+1 );
		    mat[i][i] = s.substring( i , i+1 );   
		    mat[i][s.length()-i-1] = s.substring(s.length()-1-i, s.length()-i);   
		    mat[s.length()-1][i] = s.substring( i , i+1 );
		    //3 more statements
		    //like the one I gave you
        }
        
    }
   public String toString()
	{
		String output="";
		for(String[] i : mat)
		{
		    for(String j : i)
		    {
		        output+=j;
		    }
		    output+="\n";
		}
		return output;
    }
}