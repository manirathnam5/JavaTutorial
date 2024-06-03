import java.util.regex.*;

class RegexExample1{


         public static void main(String[] arg){


          Pattern p = Pattern.compile(".s"); //represents single characater 

          Matcher m = p.matcher("as");

          boolean b = m.matches();

          System.out.println(b) ;

      

          // differenct scenarios

          System.out.println( Pattern.matches(".s","as")); //return true

          System.out.println(Pattern.matches(".s","aas")); //return false 

          System.out.println(Pattern.matches(".s","mmass")) ; //return false 

          System.out.println(Pattern.matches(".s","mk")); //return true 








              

         }
    
}