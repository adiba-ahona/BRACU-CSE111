public class Car{
  private int year;
  private static int objectCount;
  public Car(int a){
    year = a;
    objectCount++;
  }
  public int getYear(){
    return year;
  }
  public static int getObjectCount(){
    return objectCount;
  }
}
  