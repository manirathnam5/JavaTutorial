class TryCatchExample4{

public static void main(String[] arg) {
    int c ;

    int a = 10 ;

    int b  = 0;

    // exception is thrown to catch block where it is resolved  
try{

      

     c = a /b;

    System.out.println("Value of c " + c) ;

}


catch(Exception e){

   System.out.println( c = a/(b+2)) ;


}

}
}