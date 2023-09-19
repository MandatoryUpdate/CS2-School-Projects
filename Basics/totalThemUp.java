
public class totalThemUp
{
   public static void main(String[] args)
   {
       int[] array1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
       int[] array2 = {10,9,8,7,6,5,4,3,2,1,-99};
       int[] array3 = {10,20,30,40,50,-11818,40,30,20,10};
       int[] array4 = {32767};
       int[] array5 = {255,255};
       int[] array6 = {9,10,-88,100,-555,1000};
       int[] array7 = {10,10,10,11,456};
       int[] array8 = {-111,1,2,3,9,11,20,30};
       int[] array9 = {9,8,7,6,5,4,3,2,0,-2,-989};
       int[] array10 = {12,15,18,21,23,1000};
       int[] array11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
       int[] array12 = {9,10,-8,10000,-5000,1000};
       int[][] arrayNum = {array1, array2, array3, array4, array5, array6, array7, array9, array10,array11};
       for(int i = 0 ; i < arrayNum.length ; i++)
       {
           System.out.println(countArray(arrayNum[i]));
       }
       
       System.out.println();
       int[]array13 = {9,8,7,6,5,4,3,2,0,-2,6};
       int[] array14 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
       int[] array15 = {-99,1,2,3,4,5,6,7,8,9,10,5};
       int[] array16 = {9,10,-88,100,-555,2};
       int[][] arrayNum2 = {array15, array2, array3, array4, array5, array16, array7, array13, array10,array14};
       for(int i = 0 ; i < arrayNum2.length ; i++)
       {
           System.out.println(sumVals(arrayNum2[i]));
       }
       
       System.out.println();
       int[] array17 = {};
       int[][] arrayNum3 = {array1, array2, array3, array4, array5, array6, array7, array9, array10,array17};
       for(int i = 0 ; i < arrayNum2.length ; i++)
       {
           System.out.println(firstRepeats(arrayNum2[i]));
       }
   }
   
   public static int countArray(int[] array)
   {
       int sum = 0;
       for(int i : array)
       {
           sum+=i;
       }
       return sum;
  }
  
  public static int sumVals(int[] array)
  {
      int sum = 0;
      for(int i = 0 ; i < array.length ; i++)
       {
           if(array[i] > array[array.length-1])
            sum+=array[i];
       }
      int last = array[array.length-1];
      if(sum < last)
        return -1;
      return sum;
  }
  
  public static boolean firstRepeats(int [] array)
  {
      int x2 = 0;
      int x = array[0];
      for(int i = 0 ; i < array.length ; i++)
      {
          if(x == array[i])
          {
              x2++;
          }
      }
      if(x2 > 1)
        return true;
      return false;
  }
}  