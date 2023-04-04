public class Vehicle{
  public int x=0;
  public int y=0;
  public void moveUp(){
    y++;
  }
  public void moveDown(){
    y--;
  }
  public void moveLeft(){
    x--;
  }
  public void moveRight(){
    x++;
  }
  public String toString(){
    return "("+ x + ","+ y +")";
  }
}