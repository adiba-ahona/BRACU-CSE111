public class Vehicle2010 extends Vehicle{
  public void moveLowerLeft(){
    moveDown();
    moveLeft();
  }
  public boolean equals(Vehicle a){
    if(x==a.x && y==a.y){
      return true;
    }else{
      return false;
    }
  }
}