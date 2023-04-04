import java.util.Scanner;
public class string06
{
  public static void main(String[] args)
  {
    Scanner ho= new Scanner(System.in);
    System.out.println("Enter a word");
    String s= ho.nextLine();
    System.out.println(s);
    String h= "==THE END==";
    String d = s.concat(h);
    System.out.println(d);
    System.out.println(s);
    
  }
}