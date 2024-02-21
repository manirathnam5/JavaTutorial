//Example of default constructor that shows default values 

class Student{

   int id ;
   String name;
   
   
    void showStudentDetails(){
	   
	  System.out.println(id + "  "+ name );
	   
      }
   
   
   
   }
   
class TestStudent1{


  public static void main(String[] arg){
  
  
      Student  s1 = new Student();
	  Student  s2 = new Student();
	  //System.out.println(s1.id);
	  //System.out.println(s1.name);
	  s1.showStudentDetails(); 
	  s2.showStudentDetails();
	 
    }
}