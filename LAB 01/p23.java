import java.util.Scanner;
public class p23
{
  public static void main(String[] args)
  {
    Scanner ruki=new Scanner(System.in);
    int inputlim=ruki.nextInt();
    for(int row=1;row<=inputlim;row++)
    {
      for(int sp=1;sp<=(inputlim-row);sp++)
      {
        System.out.print(" ");
      }
      for(int col=1;col<=row;col++)
      { 
        if((row==1||row==inputlim)||(col==1||col==inputlim))
          System.out.print("*");
        else if(row==col)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}