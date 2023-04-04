public class FootBallTeam extends Team{
  public FootBallTeam(String a, String b){
  super(a,b);
  }
  public String toString(){
   System.out.println("Our name is " + super.name); 
     return "We play Football";
  }
   public void getMascot(){
   System.out.println("Our football team mascot name " + mascot);
  }
}