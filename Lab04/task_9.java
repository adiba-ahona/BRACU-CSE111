public class task_9
{
  public static void main(String[]args)
  {
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount();
    BankAccount acc3 = new BankAccount();
    
    acc1.setName("Rahman");
    acc1.setAddress("Dhaka");
    acc1.setAccountId("19201006");
    acc1.setBalance(3000.00);
    acc1.addInterest();
    
    acc2.setName("Ahmed");
    acc2.setAddress("Khulna");
    acc2.setAccountId("19201006");
    acc2.setBalance(5000.00);
    
    acc3.setName("Khan");
    acc3.setAddress("Canada");
    acc3.setAccountId("19201006");
    acc1.setBalance(9000.00);
    acc3.addInterest();
    
    System.out.println(acc1.getName());
    System.out.println(acc1.getAddress());
    System.out.println(acc1.getAccountId());
    System.out.println(acc1.getBalance());
    
    System.out.println(acc2.getName());
    System.out.println(acc2.getAddress());
    System.out.println(acc2.getAccountId());
    System.out.println(acc2.getBalance());
    
    System.out.println(acc3.getName());
    System.out.println(acc3.getAddress());
    System.out.println(acc3.getAccountId());
    System.out.println(acc3.getBalance());   
  }
}