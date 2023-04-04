public class Dog { 
private String color = "Black";
private String action = "barking"; 
  public Dog(){
  }
  public Dog(String a){
    color = a;
  }
  public void changeColor(String d){
    color = d;
  }
  public void bark(){
    System.out.println(color+" dog is "+action);
  }
}

