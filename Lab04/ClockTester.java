public class ClockTester{
  public static void main(String[]agrs){
    Clock clock = new Clock(368000);
    System.out.println(clock);
    for(int i=1;i<=10;i++){
      clock.tick();
      System.out.println(clock);
    }
    Clock clock2 = new Clock(12,2,6);
    for(int j=1;j<=10;j++){
      clock2.tick();
      System.out.println(clock2);
    }
    Clock clock3 = new Clock(35368);
    for(int j=1;j<=10;j++){
      clock3.tick();
      System.out.println(clock3);
    }
    clock.addClock(clock2);
    System.out.println("Clock1 : "+clock.toString());
    System.out.println("Clock2 : "+clock2.toString());
    System.out.println("Clock3 : "+clock3.toString());
    System.out.println("AddClock : "+clock.addClock(clock2));
    System.out.println("Difference between 2 clock: "+clock.subtractClock(clock2));
  }
}