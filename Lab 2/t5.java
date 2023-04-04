import java.util.Scanner;
public class t5
{
public static void main(String[] args)
{
Scanner ho= new Scanner(System.in);
int []arr= new int[10]; 
 for(int i=0;i<=9;i++)
    {
      System.out.println("Enter number");
      arr[i]=ho.nextInt();
    }
System.out.println("Enter a number: ");
int x= ho.nextInt();
int flag= 0;
for(int i=0;i<=9;i++)
{
if(arr[i]==x)
{
 flag++;
  }
}
 if(flag==1) 
 {
 System.out.println("Yes");
 }
 else{
 System.out.println("No");
 }
}
}