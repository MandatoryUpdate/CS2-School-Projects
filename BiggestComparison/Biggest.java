//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Biggest
{
    public static int getBig(int[][] m)
    {
		int biggest = m[0][0];
		for(int[] i : m)
		{
		    for(int j : i)
		    {
		        if(j > biggest)
		        {
		            biggest = j;
		        }
		    }
		}
		return biggest;
    }
}