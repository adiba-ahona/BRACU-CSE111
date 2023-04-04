import java.util.Scanner;
public class t6
{
public static void main(String[] args)
{
Scanner ho= new Scanner(System.in);
int []arr= new int[15]; 
 for(int i=0;i<=14;i++)
    {
      System.out.println("Enter number");
      arr[i]=ho.nextInt();
    }
System.out.println("Enter a number: ");
int x= ho.nextInt();
int flag= 0;
for(int i=0;i<=14;i++)
{
if(arr[i]==x)
{
 flag++;
  }
}
System.out.println(flag);
}
}