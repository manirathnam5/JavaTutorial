class ExceptionHandlingExample1{


    public static void main(String[] arg) {
      
        try{

        String str = "abc" ;

        int a = Integer.parseInt(str);


        System.out.println(a) ;
    }
    catch(ArithmeticException ae){
        System.out.println("Number should not be dividec by zero ") ;
    }

    }



}