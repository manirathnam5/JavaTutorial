class EqualsIgnoreCaseExample1 {

  

    public static void main(String[] arg) {
  

        String s1 = "WELCOME" ;

        String s2 = "welcome" ;

        String s3 = "welcome123";


        String s4 = "hello" ;

        System.out.println(s1.equalsIgnoreCase(s2)) ;  // return true 

        System.out.println(s1.equalsIgnoreCase(s3)) ; //return false 

        System.out.println( s2.equalsIgnoreCase(s4)); //return false


    }

    
}