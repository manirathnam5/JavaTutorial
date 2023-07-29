class NestedIfStatement{


   public static void main(String[] arg){
   
         
         //String ITpark = "Embassy Tech Park";
     
	     String ITpark = "Ecospace";
         
         String company = "JPMC";

  
           if( ITpark.equals("Embassy Tech Park")){

                 if(company.equals("JPMC")){
                      System.out.println("Access granted to JPMC");
                    }
                 if(company.equals("Wells Fargo")){
                    System.out.println("Access granted to Wells Fargo");
                     }
             }
           else{
            System.out.println("Not allowed to enter the ETV Tech Park");
            }

  }
}  
	  
	  