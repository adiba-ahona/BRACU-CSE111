public class string0301
{
public static void main(String[] args)
{
String s = "PROGRAMMING";
 for(int i=0; i<=s.length(); i++) 
 {
 char ch = s.charAt(i);
int codeForCh = (int) ch;
  System.out.println(s.charAt(i) +":"+ codeForCh );
 }
}
}
