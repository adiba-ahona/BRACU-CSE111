import java.util.Scanner;
public class p11
{
  public static void main(String[] args)
  {
    Scanner tomoe=new Scanner(System.in);
    int inputlim=tomoe.nextInt();
    for(int row=1;row<=inputlim;row++)
    {
      for(int sp=1;sp<=inputlim-row;sp++)
      {
        System.out.print(" ");    
      }
      for(int col=1;col<=(2*row-1);col++)
      {
        if(row==1||col==1)
          System.out.print(col);
        else if(col==(2*row-1))
          System.out.print(col);
        else
          System.out.print(" ");
      }
      System.out.println();
      
    }
    for(int row=inputlim-1;row>0;row--){
      for(int sp=1;sp<=inputlim-row;sp++){  
        System.out.print(" ");  
      }
      for(int col=1;col<=(2*row-1);col++)
      {
        if(row==1||col==1)
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