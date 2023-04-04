import java.util.Scanner;
public class p10
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
     for(int col=1;col<=(2*row-1);col++){
       if(row==1||row==inputlim||col==1)
     System.out.print(col);
       else if(col==(2*row-1))
         System.out.print(col);
       else
         System.out.print(" ");
     }
  System.out.println();
  }
}
}