import java.util.Scanner;
public class string04
{  public static void main(String[] args)
  {
  Scanner ho = new Scanner(System.in);
  int[] arr= new int[5];
  int i,n;
  System.out.println("enter total eight numbers between 2 and 4 only, otherwise I will have to make my array larger.");
  for(i=0;i<=7;++i){
    n=ho.nextInt();
    arr[n]=arr[n]+1;
  }
  for(i=2;i<=4;++i){
    System.out.println(i+" was found "+ arr[i]+ " times");        
  }
}
}