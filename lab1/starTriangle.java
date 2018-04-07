public class starTriangle
{
  public static void main(String[] args)
   {   
     for (int row = 1; row <= 5; row++)
      {
        int i = 1;
        while (i < row )
        {
          System.out.print( "*" );
          i = i+1;
        }
        System.out.println( "*" );
      }
   }
}
