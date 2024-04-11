class Bank {
	
	
	public int getRateOfInterest(){
		
		return 0 ;
		
	}
}


  class SBI  extends Bank {
	  
	  public int getRateOfInterest(){
		  
		  return 3 ;
		  
	  }
	  
  }
  
  
  class AxisBank extends Bank {
	  
	  public int getRateOfInterest(){
		  
		  return 5;
		  
	  }
  }  
	class HdfcBank extends Bank {
		
		public int getRateOfInterest(){
			
			
			return 8;
			
		}
	}

   class CanaraBank extends Bank{

     public int getRateOfInterest(){

         return 9;
	 }
   }

  class MethodOverridingClient3{

   public static void main(String[] arg){

    SBI  sbi = new SBI();
    System.out.println( "SBI "+sbi.getRateOfInterest() + " %");	
	
    AxisBank axis = new AxisBank();
    System.out.println("Axis Bank "+ axis.getRateOfInterest() + " %");

    HdfcBank  hdfc = new HdfcBank();
     System.out.println("Hdfc Bank "+ hdfc.getRateOfInterest() + " %");
	
    CanaraBank canara = new CanaraBank();
     System.out.println("Canara Bank "+canara.getRateOfInterest() + " %");

   }
  }   
		