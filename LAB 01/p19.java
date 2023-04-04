import java.util.Scanner;
public class p19
{
  public static void main(String[] args)
  {
    Scanner go= new Scanner(System.in);
    int inputlimit= go.nextInt();
    for(int row=1; row<=inputlimit; row++)
    {
      for(int space=1; space<=(inputlimit-row); space++)
      {
        System.out.print("  ");
      }
      for(int column=1; column<=2*row-1; column++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}