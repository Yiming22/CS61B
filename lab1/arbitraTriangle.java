public class arbitraTriangle
{
  public static void drawTriangle(int N)
   {
    for (int row = 1; row <= N; row++)
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


  public static void main(String[] args)
   {   
     drawTriangle(10);
   }
}

