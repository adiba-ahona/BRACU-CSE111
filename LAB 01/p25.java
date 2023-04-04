import java.util.Scanner;
public class p25{
  public static void main(String[] args){
    
    Scanner ho=new Scanner(System.in);
    int inputlimit=ho.nextInt();
    for(int row=1;row<=inputlimit;row++)
    {
      for(int sp=1;sp<=inputlimit-row;sp++)
      {  
        System.out.print(" ");
      }
      for(int column=1;column<=(2*row-1);column++)
      {
        if(row==1||column==1)
          System.out.print("*");
        else if(column==(2*row-1))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    for(int row=inputlimit-1;row>0;row--)
    {
      for(int sp=1;sp<=inputlimit-row;sp++)
      {  
        System.out.print(" ");  
      }
      for(int col=1;col<=(2*row-1);col++)
      {
        if(row==1||col==1)
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