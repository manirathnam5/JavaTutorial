class Product{
	
	int  productId;
	String prodcutName;
	int price ;
	
	
	Product(int productId , String prodcutName , int price){
		this.productId = productId;
		this.prodcutName = prodcutName ;
		this.price = price ;
		
	}
	
	Product( Product p1 ){
		this.productId = p1.productId;
		this.prodcutName = p1.prodcutName;
		this.price = price;
	}
	
	
	void showPriceDetails(){
		System.out.println(productId + "    " + prodcutName + "    " + price );
		
	}
	
}

 class ConstructorExample1{
	   
	   public static void main(String[] arg){
		   
          	 Product  p1 = new Product(111,"Mobile", 10000 );
             Product  p2 = new Product(p1);

         p1.showPriceDetails();
         p1.showPriceDetails();

	   }
 }	   
		   
		   
	
	
	