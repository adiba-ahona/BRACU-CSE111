public class ComplexNumber extends RealNumber{
  private double ComplexValue;
  public ComplexNumber(){
    ComplexValue = 1;
    setRealValue(1);
  }
  public ComplexNumber(double real, double complex){
    ComplexValue = complex;
    setRealValue(real);
  }
  public String toString(){
    String s = super.toString() + "\n" + "Imaginary part" + ComplexValue;
    return s;
  }
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    System.out.println("Checking ended.");
  }
}