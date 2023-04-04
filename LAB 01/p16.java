import java.util.Scanner;
public class p16
{
  public static void main(String[] args)
  {
    Scanner go= new Scanner(System.in);
    int rowquantity= go.nextInt();
    int columnquantity= go.nextInt();
    for(int rowcount=1; rowcount<=rowquantity; rowcount++)
    {
      for(int columncount=1; columncount<=columnquantity; columncount++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}