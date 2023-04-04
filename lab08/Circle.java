public class Circle extends Point{
  public Circle(double _radius){
  super(_radius);
  System.out.println("Creating a Circle … done!");
  }
  double space(){
  double r = getRadius();
  double area = Math.PI * r * r;
  return area;
  }
}