class Tenant{

    String  tenantName;
  
    int roomNo;
  
    String address;
  
  
  public void showTenantInfo(){
  
    System.out.println("Tenant Name "+tenantName );
	
	System.out.println("RoomNo "+roomNo );
	
	System.out.println("Address "+address );
	
	}
	
	}
	
class OopsExample{

     public static void main(String[] arg){

     	 Tenant   obj1 = new Tenant();
		/* 
		  obj1.tenantName = "Manish";
		  obj1.roomNo = 54;
		  obj1.address = "Munnekollal";
		  */
		  
		  obj1.showTenantInfo();
		
		}
		
  }
		
		
	