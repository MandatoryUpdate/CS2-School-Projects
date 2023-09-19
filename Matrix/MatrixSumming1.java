import java.util.*;
import java.io.*; 

public class MatrixSumming1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int sum(  )
    {
		int total = 0;
		System.out.println("Matrix values");
		for(int[] i : m)
		{
		    for(int j : i)
		    {
		        total+=j;
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
		return total;
    }
}