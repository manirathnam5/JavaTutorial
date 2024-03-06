  class Student {
  
    int rollNo;
	String name ;
	static String college = "ABC";
	
	Student(int rollNo , String name ){
	this.rollNo = rollNo ;
	this.name = name;
	
	 }
	 
	 public String getStudentDetails(){
	 
	 return rollNo + "  " + name + "  " + college ;
	 
	 }
	 
	 
	 }
	 
	 class StaticKeywordExample1{
	 
	   public static void main(String[] arg){
	   
	   Student s1 = new Student(111, "Nickel" );
	   Student s2 = new Student(112,"Janvi");
	   Student s3 = new Student(134, "Sandy");
	  
	  System.out.println(s1.getStudentDetails());
	  System.out.println(s2.getStudentDetails());
	  System.out.println(s3.getStudentDetails());
	  
	  
	  }
	  }
	  
	   
	   