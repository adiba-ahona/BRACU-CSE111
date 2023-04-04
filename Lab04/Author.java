public class Author{
  private String firstName;
  private String lastName;
  public Author(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public String toString(){
    return firstName+" "+lastName;
  }
}