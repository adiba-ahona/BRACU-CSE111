import java.util.Scanner;
public class p1
{
  public static void main(String[] args)
  {
    Scanner go= new Scanner(System.in);
    int columncount= go.nextInt();
    for(int i=1; i<=columncount; i++)
    {
      System.out.print(i);
    }
  }
}