public class CricketTeam extends Team{
  public CricketTeam(String a, String b){
  super(a,b);
  }
  public String toString(){
   return "Our name is " + super.name + "\n We play cricket";
  } 
  public void getMascot(){
   System.out.println("Our cricket team mascot name " + mascot);
  }
}