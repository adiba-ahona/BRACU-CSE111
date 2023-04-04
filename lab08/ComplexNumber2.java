public class ComplexNumber2 extends RealNumber{
 public double i =0.0;
 public String toString(){
    return "RealPart:" +this.realValue+"\n ImaginaryPart: "+i;
 }
    public void SetImaginaryNumber(double a){
      this.i=a;
      
      }
 }