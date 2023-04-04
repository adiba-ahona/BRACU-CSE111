import java.util.Scanner;
public class p3
{
  public static void main(String[] args)
  {
    Scanner go= new Scanner(System.in);
    int inputlimit= go.nextInt();
    
    for(int row=1; row<=inputlimit; row++)
    {
      for(int column=1; column<=row; column++)
      {
        System.out.print(column);
      }
      System.out.println();
    }
  }
}