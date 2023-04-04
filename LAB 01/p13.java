import java.util.Scanner;
public class p13
{
  public static void main(String[] args)
  {
    System.out.println("Input value : ");
    Scanner ho= new Scanner(System.in);
    int inplim= ho.nextInt();
    for(int col1=1; col1<=inplim ; col1++)
    {
      System.out.print(col1);
    }
    for(int col2=(inplim-1);col2>=1; col2--)
    {
      System.out.print(col2);
    }
    System.out.println();
  }
}