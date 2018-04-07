public class maxinArray
{
  public static int max(int[] m)
  {
   int maxValue = 0;
   int arrayLength = m.length;
   int temp = m[0];
   int maxIndex = 0;
   
   System.out.println(m.length);
   for (int i = 0; i< arrayLength; i++)
   {
     if (m[maxIndex] <= m[i])
     {
       maxValue = m[i];
       maxIndex = i;
     }
     
   }
    
   return maxValue;
  }

  public static void main(String[] args)
  {
   int maxValue;
   int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6, 32};
   maxValue = max(numbers);
   System.out.println(maxValue);
  }





}
