public class CheckingAccount extends Account{
  public CheckingAccount(String n, double b){
    super(n);
    setBalance(b);
  }
  public void printAccountInfo(){
    System.out.println("=======================================");
    System.out.println("Name : " + getName());
    System.out.println("Account Number : "+ getAccountNumber());
    System.out.println("Balance : "+ getBalance());
    
    if (getBalance()<600){
      System.out.println("Your balance is less than the minimum amount ");
    }
    System.out.println(" =======================================");
  }
  public String deposit(double d){
    if(d<=0){
      return "Please enter amount greater than Zero";
    }else{
      return"Deposit successful";
    }
  } 
  public String withdraw(double w){
    if(w<=0){
      return "Please enter amount greater than Zero";
    }else{
      if(w>getBalance()){
        return "You don't have enough funds";
      }else{
        return"Withdraw successful";
      }
    }  
  }
}