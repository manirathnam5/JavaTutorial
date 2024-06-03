class StringExample15{

//ex. of trim method 
    public static void main(String[] arg) {

      String s1 = "  hello  world  " ;
 
      System.out.println(s1.length());

      String tr = s1.trim() ;

      System.out.println(tr.length());


      // indexOf method 

      String str = "whereareyou";

      System.out.println(str.indexOf('e'));

      String str1 = "Welcome to Java programming ";
      System.out.println(str1.indexOf("Java"));


    }
}