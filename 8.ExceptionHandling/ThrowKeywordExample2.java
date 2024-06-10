// Program to throw user defined exception - simple real use case 

 class UserDefinedException extends Exception {


    public  UserDefinedException(String str){
            
        super(str) ;

     }

 }


class ThrowKeywordExample2{



   static void validate(String  footwear)  throws Exception{


        if(footwear.equalsIgnoreCase("Yes") ) {

            throw  new UserDefinedException("Please remove shoes and enter the Showroom ") ;
        }
       else{

            System.out.println(" No footwear detected , you are allowed to enter the showroom ") ;
       }

    }


    public static void main(String[] arg) throws Exception{


          validate("Yes") ;

          System.out.println("Throw keyword ");
          

    }
}