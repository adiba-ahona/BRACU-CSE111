import java.util.Scanner;
public class string0401{
  public static void main(String[]args){
    Scanner ho= new Scanner(System.in);
    System.out.print("Enter a word:");
    String word = ho.nextLine();
    int x = word.length();
    int []a = new int[x];
    for(int i=0; i<x; i++){
      a[i] = word.charAt(i);
    }
   
    for(int i=0; i<x; i++){
      int y = ((int)(char)a[i]) - 1;
      System.out.print((char)(y));
    }
    System.out.println();
  }
}