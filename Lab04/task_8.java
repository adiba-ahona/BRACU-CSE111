public class task_8
{
  public static void main(String[]args)
  {
    Student john = new Student();
    Student mike = new Student();
    Student carol = new Student();
    john.setName("John");
    john.setAddress("London");
    john.setId("19201006");
    john.setCGPA(4.00);
    
    mike.setName("Mike");
    mike.setAddress("New York");
    mike.setId("19201007");
    mike.setCGPA(3.95);
    
    carol.setName("Carol");
    carol.setAddress("Paris");
    carol.setId("17201008");
    carol.setCGPA(3.84);
    
    System.out.println(john.getName());
    System.out.println(john.getAddress());
    System.out.println(john.getId());
    System.out.println(john.getCGPA());
    
    System.out.println(mike.getName());
    System.out.println(mike.getAddress());
    System.out.println(mike.getId());
    System.out.println(mike.getCGPA());
    
    System.out.println(carol.getName());
    System.out.println(carol.getAddress());
    System.out.println(carol.getId());
    System.out.println(carol.getCGPA());
  }
}