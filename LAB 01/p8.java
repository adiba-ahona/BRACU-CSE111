import java.util.Scanner;
public class p8 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++)
    {
      for (int j=1;j<=i;j++)
      {
        if(j==1||i==j||i==num)
        {
          System.out.print(j);
        }
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}