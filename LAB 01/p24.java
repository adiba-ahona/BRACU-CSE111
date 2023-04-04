import java.util.Scanner;
public class p24
{
  public static void main(String[] args)
  {
    Scanner ho=new Scanner(System.in);
    int inputlimit=ho.nextInt();
    for(int row=1;row<=inputlimit;row++)
    {
      for(int sp=1;sp<=(inputlimit-row);sp++)
      {
        System.out.print(" ");  
      }
      for(int col=1;col<=(2*row-1);col++)
      {
        if(row==1||row==inputlimit||col==1)
          System.out.print("*");
        else if(col==(2*row-1))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}