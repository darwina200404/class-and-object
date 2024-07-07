class Student{
    int id;
    String name;
  }
  class testStudent{
    public static void main(String []args){
      Student s1=new Student();
      Student s2=new Student();
      s1.name="Darwin";
      s2.id=101;
      s1.id=102;
      s2.name="ram";
      System.out.println("student name\t"+s1.name+"\tstudent id\t"+s1.id);
       System.out.println("student name\t"+s2.name+"\tstudent id\t"+s2.id);
      
    }
  }
