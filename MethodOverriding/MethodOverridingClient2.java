class Computer {
	
	public String showSpecs(){
		
		return "Ram 6 GB" + " " + "Hard DisK 1 TB" ;
		
	}
	
}

class Dell  extends Computer {
	
	public String showSpecs(){
		
		return "RAM 4 GB " + " "+ "Hard Disk 2 TB"; 
   
    }
	
}


class Sony extends Computer {
	
	  public String showSpecs(){
		  
		  return "RAM 8 GB " + "  " + "Hard Disk 50 GB" ;
		  
	  }
	  
	  
}

 class MacBook extends Computer {
	 
	    public String showSpecs (){
			
			return "RAM 7 GB " + "  "+ "Hard Disk 60 GB" ;
			
		}
		
 }
 
 
 class MethodOverridingClient2{
	 
	 public static void main(String[] arg){
		 
		 Dell dell = new Dell();
		 System.out.println(dell.showSpecs());
		 
		 Sony  sony = new Sony();
		 System.out.println(sony.showSpecs());
		 
		 MacBook  macBook = new MacBook();
		 System.out.println(macBook.showSpecs());
		 
	 }
	 
 }