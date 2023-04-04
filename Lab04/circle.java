public class circle{
  private double radius = 1.0;
  private String color = "red";
  public double area;
  public circle(){
  }
  public circle(double a){
    radius =a;
  }
  public double getRadius(){
    return radius;
  }
  public double getArea(){
    area = 3.1416*radius*radius;
    return area;
  }
}