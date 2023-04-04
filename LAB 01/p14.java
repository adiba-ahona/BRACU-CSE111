import java.util.Scanner;
public class p14
{
  public static void main(String[] args)
  {
    System.out.println("Input value : ");
    Scanner ho= new Scanner(System.in);
    int inplimit= ho.nextInt();
    for(int row=1; row<=inplimit; row++)
    {
      for(int sp=1; sp<=(inplimit-row);sp++)
      {  
        System.out.print(" ");
      }
      for(int col1=1; col1<=row ; col1++){
        System.out.print(col1); 
      }
      for(int col2=(row-1);col2>=1; col2--){
        System.out.print(col2);
      }
      System.out.println();
    }  
  }
}