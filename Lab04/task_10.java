public class task_10{
  public static void main(String[]args){
    circle cir1 = new circle();
    circle cir2 = new circle(2.5);
    System.out.println(cir2.getRadius());
    System.out.println(cir1.getArea());
    System.out.println(cir2.getArea());
  }
}