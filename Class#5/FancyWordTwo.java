//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.*;
public class FancyWordTwo
{
	private String[][] mat;

   public FancyWordTwo(String s)
	{
		//size the matrix
		mat = new String[s.length()][s.length()];
		
		//use Arrays.fill() to fill in the matrix with spaces
		for(String[] i : mat)
		{
		    Arrays.fill(i, " ");
		}

		//use a for loop to load in the letters into the matrix
		for(int i = 0 ; i < s.length() ; i++)
		{
		    mat[0][i] = Character.toString(s.charAt(i));
		    mat[i][0] = Character.toString(s.charAt(i));
		    mat[i][s.length()-1] = Character.toString(s.charAt(s.length()-1-i));
		    mat[s.length()-1][i] = Character.toString(s.charAt(s.length()-1-i));
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