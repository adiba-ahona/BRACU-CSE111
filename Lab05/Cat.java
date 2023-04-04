public class Cat{
  public String color = "White"; 
  public String action = "sitting"; 
  public Cat(){
  }
  public Cat(String a){
    color = a;
  }
  public Cat(String b, String c){
    color = b;
    action = c;
  }
  public void changeColor(String d){
    color = d;
  }
  public void printCat(){
    System.out.println(color+" cat is "+action);
  }
}
