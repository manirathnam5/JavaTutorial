class TryCatchExample3{


    public static void main(String[] arg) {


        try{
            int a = 100/0 ;

            System.out.println("rest of the code ");
        }

        catch(ArithmeticException ae){
            System.out.println("Numbers should not be divided by zero ") ;
        }


        System.out.println("After try catch block code") ;  // this will executed because exception is handled 

// handling exception using parent class exception 

        try{
            int a = 100/0 ;

            System.out.println("rest of the code ");
        }

        catch(Exception ae){
            System.out.println("Numbers should not be divided by zero ") ;
        }

        
    }
}