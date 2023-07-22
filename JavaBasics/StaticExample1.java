class Student{

   String name ;
   int  rollno;
   static String COLLEGE_NAME = "MIT";

  void showStudentInfo(){
   System.out.println(name +" "+ rollno+" "+ COLLEGE_NAME);
   }

 }

class StaticExample1{

  public static void main(String[] arg){

     Student  s1 = new Student();
     Student  s2 = new Student();
     
    s1.showStudentInfo();
    Student.COLLEGE_NAME= "IIT";
   s2.showStudentInfo();
    
  
   }
}
    
   