public class BankAccount{
  private String name;
  private String accountid;
  private String address;
  private Double balance;
  public String getName()
  {
    return name;
  }
  public void setName(String n)
  {
    name=n;
  }
  public String getAccountId()
  {
    return accountid;
  }
  public void setAccountId(String i)
  {
    accountid=i;
  }
  public String getAddress()
  {
    return address;
  }
  public void setAddress(String a)
  {
    address=a;
  }
  public Double getBalance()
  {
    return balance;
  }
  public void setBalance(Double b)
  {
    balance=b;
  }
  public void addInterest()
  {
    balance=balance+balance*0.07;
  }
}