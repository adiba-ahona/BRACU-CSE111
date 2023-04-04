public class Teacher {
  private String name;
  private String dept;
  private String course = " ";
  public Teacher()
  { }
  
  public Teacher(String _name, String _dept) 
  {
    name = _name;
    dept = _dept;
  }
  public void addCourse(Course course) 
  {
    this.course +="\n" + course.name;
  }
  public void printDetail() 
  {
    System.out.println("==========");
    System.out.println("Name: " + name);
    System.out.println("Department: " + dept);
    System.out.println("List of courses");
     System.out.println("==========");
    System.out.println(course);
     System.out.println("==========");
  }
}