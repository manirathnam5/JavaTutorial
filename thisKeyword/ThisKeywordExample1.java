// Program to explain this keyword
// this keyword refers to current object 

 class Teacher{
 
   public String name;
   public String subject;
   public String departmentName;
   public static String schoolName = "ST.Johns";
   
     Teacher(String name , String subject , String departmentName  ){
     this.name = name ;
	 this.subject = subject ;
	 this.departmentName = departmentName ;
	 
	 }
	 
	  public void showTeacherInfo(){
	 
	    System.out.println( name + "  " + subject +"  " + departmentName + "  "+ schoolName) ;
	 
	 }
	 
	 }
	 
	 
	 
 class ThisKeywordExample1 {
  
   public static void main(String[] arg){
	   
	   Teacher t1 = new Teacher("Steve", "Maths"  , "CSE" );
	   Teacher t2 = new Teacher("Mark", "Science" , "ECE" );
	   Teacher t3 = new Teacher("Steffy", "Science" , "ECE" );
	   Teacher t4 = new Teacher("Raj", "Science" , "ECE" );
	   
	   
	   t1.showTeacherInfo();
	   t2.showTeacherInfo();
	   t3.showTeacherInfo();
	   t4.showTeacherInfo();
	   
     } 
 }