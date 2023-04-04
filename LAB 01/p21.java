import java.util.Scanner;
public class p21
{
  public static void main(String[] args)
  {
    Scanner go= new Scanner(System.in);
    int rowlimit= go.nextInt();
    int columnlimit= go.nextInt();
    for(int row=1;row<=rowlimit;row++)
    {
      for (int column=1;column<=columnlimit;column++)
      {
        if(row==1 || row==rowlimit || column==1 || column==columnlimit)
        {
          System.out.print("*");
        }
        
        else{
          System.out.print(" ");}
      }
      
      System.out.println();
    }
  }
}