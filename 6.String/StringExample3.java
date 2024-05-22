class StringExample3{


    public static void main(String[] arg) {



        String s1  = "Hello" ;

        String s2 = "World" ;


     //using concat method 
        String s3 = s1.concat(s2) ;

        System.out.println(s3) ;

     //using append method
     
      StringBuffer s4 = new StringBuffer("Welcome") ;



      StringBuffer s5 = new StringBuffer("Javaworld");


      StringBuffer s6 = s4.append(s5);


      System.out.println(s6) ;



    
    } 
}