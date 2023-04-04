import java.util.Scanner;
  public class string0403
{
  public static void main(String[] args)
  {
    Scanner ho= new Scanner(System.in);
    System.out.println("Enter a word : ");
    String s = ho.nextLine();
    int c=0;
    for(char x='A' ; x<='Z'; x++)
    {
      for(int i=0; i<= s.length(); i++)
      {
        if(s.codePointAt(i)==x)
        {
          c++;
        }
      }
      System.out.println(x + "which is "+ (int) x +"was found "+ c + "times" );
      c=0;
    }
  }
}