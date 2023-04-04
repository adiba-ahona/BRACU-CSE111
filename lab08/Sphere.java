public class Sphere extends Point{
  public Sphere(double _radius){
  super(_radius);
  System.out.println("Creating a Sphere … done!");
  }
  double space(){
  double r = getRadius();
  double area = (4/3)* Math.PI * r * r * r;
  return area;
  }
}