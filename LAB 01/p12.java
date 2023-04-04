import java.util.Scanner;
public class p12
{
  public static void main(String[] args)
  {
    Scanner go= new Scanner(System.in);
    int inputlim= go.nextInt();
    for(int row=1; row<=inputlim; row++)
    {
      for(int sp=1; sp<=(inputlim-row); sp++)
      {
        System.out.print("  ");
      }
      for(int col=inputlim; col>=row; col--)
      {
        System.out.print(col);
      }
      System.out.println();
    }
  }
}