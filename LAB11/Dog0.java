public class Dog0 extends Animal0 implements SoundSource{
  public Dog0(String d){
  super(d);
  }
  public void makeSound(){
  System.out.println(getName() + " is crying. ");
  }
}