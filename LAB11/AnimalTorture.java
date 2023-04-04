public class AnimalTorture {
 
 private void hugAnimal(SoundSource a){
  a.makeSound();
 }
 
 public static void main(String[] args) {
  Dog0 d = new Dog0("Rover");
  AnimalTorture at = new AnimalTorture();
  at.hugAnimal(d);
 }
}