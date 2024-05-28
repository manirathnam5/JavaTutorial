
// using compareTo method 
class StringExample13{

    
     public static void main(String[] arg){


          String s1 = "hello" ;
          String s2 = "aello" ;

          System.out.println(s1.compareTo(s2));

          //String concat method


          String s3 = "Welcome " ;

          String s4 = "to javaworld" ;

          System.out.println(s3.concat(s4));


      //adding spaces using concat method 
      
      String s5 = "Hi";

      String s6 = "Programmers";

      String s7 = "of JAVA" ;

    //  String s10 = s5.concat(s6).concat(s7);
     System.out.println(s5.concat(s6).concat(s7));
 

     //System.out.println(s10);

    //add string at beginning using concat

    String s11 = "Developers";

    String s12 = "Hello ".concat(s11);

    System.out.println(s12);


    // adding special characters 

     String s14 = s12.concat("@").concat(".com!!");

     System.out.println(s14) ;


     }

}