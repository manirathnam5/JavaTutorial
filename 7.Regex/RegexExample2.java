 


import java.util.regex.*;


//using character classes
class RegexExample2{


    public static void main(String[] arg){
       
           
        System.out.println(Pattern.matches("[a,b,c]","amn"));

        System.out.println(Pattern.matches("[amn]", "abcd"));





    }
}