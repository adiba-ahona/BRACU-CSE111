import java.util.Scanner;
public class t3
{
  public static void main(String[] args)
  {
    Scanner ho=new Scanner(System.in);
    int[] dhaka=new int[10];
    for(int i=0; i<=9; i++)
    {
      System.out.println("Enter number : ");
      dhaka[i]=ho.nextInt();
    }
    for(int i=9;i>=0;i--)
    {
      System.out.println(dhaka[i]);
    }
  }
}