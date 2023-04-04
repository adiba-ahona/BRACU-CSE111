import java.util.Scanner;
public class t9
{
  public static void main(String[] args)
  {
    Scanner ho=new Scanner(System.in);
    int []arr= new int[10];
    for(int i=0;i<arr.length;i++)
    {
      System.out.println("Enter number: ");
      arr[i]=ho.nextInt();
    }
    for(int i=0;i<arr.length;i=i+2)
    {
      System.out.print(arr[i]+" ");
    }
    for(int i=0;i<arr.length;i++)
    {
      if(i%2!=0)
      {
        System.out.print(arr[i]+" ");
      }
    }
  }
}