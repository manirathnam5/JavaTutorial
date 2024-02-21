  //Example for parameterized constructor 
  
   class Employee{
	   
	   int empId;
	   String empName;
	   String companyName;
	   
	   Employee(int empId , String empName , String companyName){
		   this.empId = empId;
		   this.empName = empName;
		   this.companyName = companyName;
		   
	   }
	   
	   
	   public String giveEmployeeDetails(){
		   
		   return empId +"  " + empName + "  "+ companyName ;
		   
	   }
	   
	   
   }
   
  class TestEmployee{
	  
	  public static void main(String[] arg){
		  
		  Employee  emp1 = new Employee(121,"Manish" , "JP Morgan");
		  Employee  emp2 = new Employee(144,"Santhosh" ,"DE Shaw" );
		  Employee  emp3 = new Employee(432,"Manirathnam" , "Booking.com");
		  
		  System.out.println("Employee 1 info's " + emp1.giveEmployeeDetails());

          System.out.println("Employee 2 info's " + emp2.giveEmployeeDetails());


          System.out.println("Employee 3 info's " + emp3.giveEmployeeDetails());		  
		  
		  
		  
	  }
  }