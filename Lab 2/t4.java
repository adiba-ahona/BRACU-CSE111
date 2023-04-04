import java.util.Scanner;
public class t4
{
  public static void main(String [] args)
  {
    Scanner go=new Scanner(System.in);
    int[] khulna=new int[10];
    for(int i=0;i<=9;i++)
    {
      System.out.println("Enter number:");
      khulna[i]=go.nextInt();
    }
    for(int i=9;i>=0;i--)
    {
       if(khulna[i]%2==0)
       {
         System.out.println(khulna[i]);
       }     
    }
  }
}
