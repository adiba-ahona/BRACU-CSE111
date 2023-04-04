public class Clock{
  int hour;
  int min;
  int sec;  
  public Clock(){
  hour=12;
  min=00;
  sec=00;
  }
  public Clock(int a,int b,int c){
  hour = a;
  min = b;
  sec = c;
  }
  public Clock(int d){
  int seconds = d%60;
  int minutes =(d/60)%60;
  int hours =(d/60)/60;
  hour = hours;
  min = minutes;
  sec = seconds;
  }
  public void setClock( int e){
  sec = e%60;
  min = (e/60)%60;
  hour = (e/60)/60; 
  }
  public int getHours(){
    return hour;
  } 
  public int getMinutes(){
    return min;
  }
  public int getSeconds(){
    return sec;
  }
  public void setHours(int f){
    hour = f;
  }   
  public void setMinutes(int g){
    sec = g;
  }  
  public void setSeconds(int f){
    min = f;
  }  
  public void tick(){
    if(min==59){
      hour++;
      min=0;
    }
    else if (sec==59){
      sec =0;
      min++;
    }
    else
      sec++;
  }     
  public Clock addClock(Clock c){
    Clock clock3 =new Clock( hour+c.hour,min+c.min,sec+c.sec);
    return clock3;
  }
  public String toString(){
    return hour+":"+min+":"+sec;
  }
  public void tickDown(){
    sec--;
  }
  public Clock subtractClock(Clock c){
    Clock clock3 =new Clock( Math.abs(hour-c.hour),Math.abs(min-c.min),Math.abs(sec-c.sec));
    return clock3;
  }
}