import java.util.Scanner;
public class t8
{
  public static void main(String [] args)
  {
    Scanner ho=new Scanner(System.in);
    int [] arr=new int[10];
    for (int i=0; i<=9; i++)
    {
     System.out.println("Enter number: ");
     int a= ho.nextInt();
     arr[i] = a;
     for (int y=0; y<i; y++)
     {
     if (arr[i]==arr[y])
     {
     System.out.println("Duplicate");
     i--;
     }
     else{}
     }
    }
  }
}