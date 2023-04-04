public class Student2{
  public String name;
  public String address;
  public String id;
  public double cgpa;
  public Student2(){
  }
  public Student2(String a, String b, String c, double d){
    name = a;
    id = b;
    address = c;
    cgpa = d;
  }
  public String nameDao(){
    if(name==null){
      return "Ei name e kono student nai";
    }else{
      return name;
    }
  }
  public String boloToAmiKe(){
    if(id==null){
      return "Student ei nai, abar id :P";
    }else{
        return id;
      }
  }
  public String addressDao(){
    if(address==null){
      return "Naam nai .. thikana ashbe koi theke?";
    }else{
      return address;
    }
  }
  public double cgpaDao(){
    if(cgpa==0){
      return -4.0;
    }else{
      return cgpa;
    }
  }
  public void standUp(){
    System.out.println(name+" is now standing up!!");
  }
  public String tellMeYourName(){
    return "Sir, my name is "+name;
  }
  public void call(String e){
    System.out.println(name+": Hey, "+e+" , Sir is calling you!!");
  }
  public void nameBoshao(String f){
    name = f;
  }
  public void addressBoshao(String g){
    address = g;
  }
  public void idBoshao(String h){
    id = h;
  }
  public void cgpaBoshao(double i){
    cgpa = i;
  }
  public int add2Numbers(int j, int k){
    int sum = j+k;
    return sum;
  }    
}