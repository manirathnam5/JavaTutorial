
 class Address{
	 
	 String state;
	 String city ;
	 String country ;
	 
	 Address( String state , String city , String country){
		 this.state = state;
		 this.city = city ;
		 this.country = country ;
	 }
 }
 
 class Employee{
	 
	 int empId;
	 String empName;
	 double empSalary;
	 Address address;
	 
	 Employee(int empId , String empName , double empSalary , Address address){
		 this.empId = empId ;
		 this.empName = empName;
		 this.empSalary = empSalary;
		 this.address = address ;
		 
	 }
	 
	 
	 void display(){
		 System.out.println( empId + " "+ empSalary +"  " + empName );
		 
		 System.out.println ( address.city + " "+ address.state + "  "+ address.country);
		 
	     }
	 
 }
 
 class AggregationExample1{
	 
	  public static void main(String[] arg){
		  
		  Address  add1 = new Address("Chennai" , "TN " , "INDIA");
		  Address  add2 = new Address("Hyderabad" , "Andra Pradesh" , "INDIA");
		  Address  add3 = new Address("Bangalore" , "Karnataka " , "INDIA");
	 
	      Employee  e1 = new Employee(112,"Manish",120000.0,add1);
		  Employee  e2 = new Employee(113,"Santhosh",120000.0,add2);
		  Employee  e3 = new Employee(114,"Manirathnam",120000.0,add3);
		  
		  
		  e1.display();
		  e2.display();
		  e3.display();
		  
	  }
 }
	 