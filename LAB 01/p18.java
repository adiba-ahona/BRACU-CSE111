import java.util.Scanner;
public class p18
{
  public static void main(String[] args)
  {  
    Scanner ho=new Scanner(System.in);
    int inputlimit=ho.nextInt();
    for(int row=1;row<=inputlimit;row++)
    {
      for(int col=1; col<=inputlimit; col++)
      {
        if(row==inputlimit || col==inputlimit-(row-1) || col==inputlimit)
        {
        System.out.print("*");
      }
      else{
          System.out.print(" ");
      }
    }
      System.out.println(); 
    }
  }
}