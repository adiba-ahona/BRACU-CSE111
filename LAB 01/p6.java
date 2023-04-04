import java.util.Scanner;
public class p6
{
  public static void main(String[] args)
  {
    Scanner go= new Scanner(System.in);
    
    int inputlimit= go.nextInt();
    
    for(int r=1; r<=inputlimit; r++)
    {
      for(int space=1; space<=(inputlimit-r); space++)
      {
        System.out.print(" ");
      }
      for(int column=1; column<=2*r-1; column++)
      {
        System.out.print(column);
      }
      System.out.println();
    }
    for(int r=inputlimit-1; r>0;r--)
    {
      for(int space=1; space<=(inputlimit-r); space++)
      {
        System.out.print(" ");
      }
      for(int column=1; column<=2*r-1; column++)
      {
        System.out.print(column);
      }
      System.out.println();
    }
  }
}
