
/**
 * Write a description of class asdsa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asdsa
{
    public static void main(String[] args){
int[] arr = {4, 12, 4, 7, 19, 6};

insertionSort(arr);
    }
    
    
public static void insertionSort(int[] elements)

{
    int sum = 0;

for (int j = 1; j < elements.length; j++)

{

int temp = elements[j];

int possibleIndex = j;

while (possibleIndex > 0 && temp < elements[possibleIndex - 1])

{

elements[possibleIndex] = elements[possibleIndex - 1];

possibleIndex--;    // Line 10
sum++;
}

elements[possibleIndex] = temp;

}
System.out.println(sum);
}
}
