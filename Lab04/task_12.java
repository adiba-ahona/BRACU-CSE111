public class task_12{
  public static void main(String[]args){
    Author ath = new Author("Charles", "Dikence");
    System.out.println(ath);
    ath.setFirstName("Rafael");
    ath.setLastName("Sabatani");
    System.out.println(ath.getFirstName()+" "+ath.getLastName());
  }
}